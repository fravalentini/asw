package asw.springboot.actor;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ActorServiceController {
	
	private final Logger logger = Logger.getLogger("asw.springboot.actor");
	
	@Value("${uri.nationality}")
	private String uriNat;
	
	@Value("${uri.award}")
	private String uriAw;
	
	@RequestMapping("/S/{actor}")
	public String getActorInfo (@PathVariable String actor){
		RestTemplate restTemplate = new RestTemplate(); 
		String nationality = restTemplate.getForObject(uriNat + actor, String.class);
		String award = restTemplate.getForObject(uriAw + actor, String.class);
		String io = "i";
		if (Integer.parseInt(award) == 1) io += "o";
		String s = actor + " e' un attore " + nationality + " e ha vinto " + award + " prem" + io + " nella sua carriera";
		logger.info("getActorInfo(): " + s);
		return s;
	}
	
	@RequestMapping("/S/{actor}/{year}")
	public String getActorInfo (@PathVariable String actor, @PathVariable String year){
		RestTemplate restTemplate = new RestTemplate(); 
		String nationality = restTemplate.getForObject(uriNat + actor, String.class);
		String award = restTemplate.getForObject(uriAw + actor + "/" + year, String.class);
		String io = "i";
		if (Integer.parseInt(award) == 1) io += "o";
		String s = actor + " e' un attore " + nationality + " e ha vinto " + award + " prem" + io + " nell'anno " + year;
		logger.info("getActorInfo(): " + s);
		return s;
	}

}
