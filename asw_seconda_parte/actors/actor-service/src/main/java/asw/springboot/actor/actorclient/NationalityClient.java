package asw.springboot.actor.actorclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("nationality")
public interface NationalityClient {
	
	@RequestMapping(value="/actor", method=RequestMethod.GET)
	public String getNationality();

}
