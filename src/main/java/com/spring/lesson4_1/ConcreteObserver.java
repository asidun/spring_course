package com.spring.lesson4_1;

import org.springframework.context.annotation.Conditional;

import com.spring.lesson4_1.Person;

@Conditional(PropertyCondition.class)
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
