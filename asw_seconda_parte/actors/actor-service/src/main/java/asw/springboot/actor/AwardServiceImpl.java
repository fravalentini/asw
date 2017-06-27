package asw.springboot.actor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.springboot.actor.actorclient.AwardClient;

@Service
public class AwardServiceImpl implements AwardService {
	
	private final Logger logger = Logger.getLogger("asw.springboot.actor");

	@Autowired
	private AwardClient awardClient;
	
	@HystrixCommand(fallbackMethod="getFallbackTotalAwards")
	public String getTotalAwards() {
		return awardClient.getTotalAwards();
	}
	
	public String getFallbackTotalAwards(){
		logger.info("getTotalAwards(): using fallback total awards: 1000");
		return "1000";
	}

	@HystrixCommand(fallbackMethod="getFallbackYearAwards")
	public String getYearAwards() {
		return awardClient.getYearAwards();
	}
	
	public String getFallbackYearAwards(){
		logger.info("getYearAwards(): using fallback year awards: 10");
		return "10";
	}

}
