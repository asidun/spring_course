package com.spring.lesson1.messaging;

import org.springframework.context.ApplicationEvent;

public class PersonEvent extends ApplicationEvent {

	public PersonEvent(Person source) {
		super(source);
	}
	
	@Override
	public Person getSource(){
		return (Person) super.getSource();
	}

}
