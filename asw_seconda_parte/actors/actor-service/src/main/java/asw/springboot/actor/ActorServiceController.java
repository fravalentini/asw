package asw.springboot.actor;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import asw.springboot.actor.actorclient.AwardClient;
import asw.springboot.actor.actorclient.NationalityClient;

@RestController
public class ActorServiceController {
	
	private final Logger logger = Logger.getLogger("asw.springboot.actor");
	
	
	@Autowired 
	private NationalityService nationalityService;
	
	@Autowired 
	private AwardService awardService;

	
	@Autowired
	private LoadBalancerClient loadBalancer;
	//private DiscoveryClient discoveryClient;
	
	@RequestMapping("/{actor}")
	public String getActorInfo (@PathVariable String actor){
		RestTemplate restTemplate = new RestTemplate(); 
		//String nationality = getInfo("S1/" + actor);
		//String award = getInfo("S2/" + actor);
		String nationality = nationalityService.getNationality();
		String award = awardService.getTotalAwards();
		String io = "i";
		if (Integer.parseInt(award) == 1) io += "o";
		String s = actor + " e' un attore " + nationality + " e ha vinto " + award + " prem" + io + " nella sua carriera";
		logger.info("getActorInfo(): " + s);
		return s;
	}
	
	@RequestMapping("/{actor}/{year}")
	public String getActorInfo (@PathVariable String actor, @PathVariable String year){
		RestTemplate restTemplate = new RestTemplate(); 
		String nationality = nationalityService.getNationality();
		String award = awardService.getYearAwards();
		String io = "i";
		if (Integer.parseInt(award) == 1) io += "o";
		String s = actor + " e' un attore " + nationality + " e ha vinto " + award + " prem" + io + " nell'anno " + year;
		logger.info("getActorInfo(): " + s);
		return s;
	}
	

}
