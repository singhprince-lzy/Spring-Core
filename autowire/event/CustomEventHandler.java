package com.prince.spring.autowire.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}
