package asw.springboot.nationality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NationalityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NationalityServiceApplication.class, args);
	}
}
