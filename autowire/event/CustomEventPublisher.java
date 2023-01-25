package com.prince.spring.autowire.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher p;
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		p=applicationEventPublisher;
	}
	
	public void publish() {
		CustomEvent c= new CustomEvent(this);
		p.publishEvent(c);
	}
	

}
