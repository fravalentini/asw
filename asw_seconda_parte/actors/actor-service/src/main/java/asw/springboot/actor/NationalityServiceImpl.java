package asw.springboot.actor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.springboot.actor.actorclient.NationalityClient;

@Service
public class NationalityServiceImpl implements NationalityService {
	
	private final Logger logger = Logger.getLogger("asw.springboot.actor");
	
	@Autowired
	private NationalityClient nationalityClient;
	
	@HystrixCommand(fallbackMethod="getFallbackNationality")
	public String getNationality() {
		return nationalityClient.getNationality();
	}
	
	public String getFallbackNationality(){
		logger.info("getNationality(): using fallback nationality: terrestre");
		return "terrestre";
	}

}
