package com.mvcpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class StarterApp {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(StarterApp.class);
		application.run(args);
	}


}
