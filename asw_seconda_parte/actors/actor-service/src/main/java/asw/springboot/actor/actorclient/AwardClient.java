package asw.springboot.actor.actorclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("award")
public interface AwardClient {
	
	@RequestMapping(value="/actor", method=RequestMethod.GET)
	public String getTotalAwards();
	
	@RequestMapping(value="/actor/year", method=RequestMethod.GET)
	public String getYearAwards();

}
