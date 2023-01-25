package com.prince.spring.autowire.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class CCloseEventHandler implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Close evet received");
	}

}
