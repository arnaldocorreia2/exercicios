package org.gradle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Projeto {
	@Bean
	public Message Ola()
	{
		
		return new HelloWorldMessage();
	}
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Projeto.class);
				 
				Message service =
				context.getBean(Message.class);
				System.out.println(service.getMessage());

	}

}
