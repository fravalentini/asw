package asw.springboot.award;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwardServiceController {
	
	@Value("${awards}")
	private String awards;
	
	private final Logger logger = Logger.getLogger("asw.springboot.award");
	
	@RequestMapping("/{actor}")
	public String getTotalAwards() {
		String[] awardArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardArray.length-1)));
		int j = (int) (Math.round(Math.random()*(awardArray.length-1)));
		String award;
		if (Integer.parseInt(awardArray[i]) == 0) award = awardArray[j];
		else award = awardArray[i] + awardArray[j];
		logger.info("getTotalAward(): " + award);
		return award; 
	}
	
	@RequestMapping("/{actor}/{year}")
	public String getAnnualAwards() {
		String[] awardArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardArray.length-1)));
		String award = awardArray[i];
		logger.info("getAnnualAwards(): " + award);
		return award; 
	}

}
