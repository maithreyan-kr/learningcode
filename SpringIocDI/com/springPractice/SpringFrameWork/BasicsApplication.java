package com.springPractice.SpringFrameWork;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//vehicle obj= (vehicle)context.getBean("bike");
		
		car obj= (car)context.getBean("car");
		obj.drive();
		//SpringApplication.run(BasicsApplication.class, args);
	    //tyre t = (tyre) context.getBean("tyre");
	    //System.out.println(t);
	}
	

}
