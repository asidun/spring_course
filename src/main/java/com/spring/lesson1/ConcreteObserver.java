package com.spring.lesson1;

import com.spring.lesson1.messaging.Person;

public class ConcreteObserver implements Observer{

	private Integer id;

	public ConcreteObserver(Integer id) {
		this.id=id;
		System.out.println(" ConcreteObserver constructor. id=" + id);
	}
	
	public Integer getId(){
		return id;
	}

	public void notify(Person person) {
		System.out.println("Observer id = " + id + ". Person name = "
				+ person.getFirstName());
	}

}
