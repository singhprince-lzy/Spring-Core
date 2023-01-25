package com.prince.spring.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prince.spring.autowire.event.CustomEventPublisher;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/prince/spring/autowire/config.xml");
	
		Employee e = (Employee) context.getBean("Employee");
		CustomEventPublisher cvp= context.getBean(CustomEventPublisher.class);
		
		cvp.publish();
		

		System.out.println(e);

	}

}
