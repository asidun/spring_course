package com.spring.lesson1.messaging;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationListener;

public class PersonEventListener implements ApplicationListener<PersonEvent>, BeanNameAware {

	private String name;

	public void setBeanName(String name) {
		this.name = name;

	}

	@Override
	public void onApplicationEvent(PersonEvent event) {
		System.out.println("Event with person " + event.getSource() + " for listener " + name);
		
	}

}
