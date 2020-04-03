package com.xp.rps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpsApplication.class, args);
	}


	@Bean
	public RPSRepo rpsRepo() {
		return new InMemoryRPSRepo();
	}
}
