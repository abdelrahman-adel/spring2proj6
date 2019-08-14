package com.master.spring.spring2proj6.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.master.spring.spring2proj5.properties.SomeExternalService;

@Configuration
@ComponentScan(basePackages = { "com.master.spring.spring2proj5" })
@PropertySource("classpath:app.properties")
public class Spring2proj6Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring2proj6Application.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Spring2proj6Application.class)) {

			LOGGER.info("{}", (Object) applicationContext.getBeanDefinitionNames());

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			LOGGER.info("URL: {}", service.getServiceUrl());
		}
	}

}
