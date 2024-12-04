package hello.springmsaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringmsaeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmsaeurekaserverApplication.class, args);
	}

}
