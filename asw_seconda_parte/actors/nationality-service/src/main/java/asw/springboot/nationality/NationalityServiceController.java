package asw.springboot.nationality;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NationalityServiceController {
	
	@Value("${nationalities}")
	private String nationalities;
	
	private final Logger logger = Logger.getLogger("asw.springboot.nationality");
	
	@RequestMapping("/{actor}")
	public String getNationality() {
		String[] nationalityArray = nationalities.split(",");
		int i = (int) (Math.round(Math.random()*(nationalityArray.length-1)));
		String nationality = nationalityArray[i];
		logger.info("getNationality(): " + nationality);
		return nationality; 
	}

}
