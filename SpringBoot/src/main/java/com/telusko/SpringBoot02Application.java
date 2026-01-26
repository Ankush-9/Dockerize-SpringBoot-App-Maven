package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.Telusko;


@SpringBootApplication  //==> @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class SpringBoot02Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot02Application.class, args);
	
		Telusko telusko = container.getBean(Telusko.class);
		boolean status=telusko.buyTheCourse(4545.4);
		if(status)
			System.out.println("Enrolled to Course");
		else
			System.out.println("Failed to enroll");
	}

}
