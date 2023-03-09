package com.midsangam.utx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UtxApplicationTests {

	public static void main(String[] args){
		var context = SpringApplication.run(UtxApplicationTests.class, args);
		TestService testService = context.getBean(TestService.class);
		testService.test();
	}

}
