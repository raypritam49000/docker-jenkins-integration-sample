package com.ecommerce.rest.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EccommerceRestApiBackendApplication {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/{name}")
	public String hello(@PathVariable("name") String name){
		LOGGER.info("@@@ {} ",name);
		return "Hello "+name;
	}


	public static void main(String[] args) {
		SpringApplication.run(EccommerceRestApiBackendApplication.class, args);
	}

}
