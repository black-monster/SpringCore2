package com.nissan.practice.SpringCore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nissan.practice.SpringCore2")
public class AppConfig {

	
	// Without use of @Bean annotation
	/*@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public IMobileProcessor getProcessor() {
		return new Snapdragon();
	}*/
}
