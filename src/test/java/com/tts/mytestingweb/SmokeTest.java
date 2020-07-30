package com.tts.mytestingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//The @SpringBootTest annotation tells Spring Boot to look
//for a main configuration class (one with @SpringBootApplication,
//for instance) and use that to start a Spring application context.
//You can run this test in your IDE or on the command line (by running
//./mvnw test or ./gradlew test), and it should pass. To convince yourself
//that the context is creating your controller, you could add an assertion,
//as the following
@SpringBootTest
public class SmokeTest {

	@Autowired
	private HomeController controller;
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
