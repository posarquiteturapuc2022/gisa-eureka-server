package br.com.posarquiteturapuc2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GisaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GisaEurekaServerApplication.class, args);
	}

}
