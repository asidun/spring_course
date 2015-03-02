package com.spring.lesson1;

import com.spring.lesson1.message.Message;

public class ConcreteObserver implements Observer{

	private Integer id;

	public ConcreteObserver(Integer id) {
		this.id=id;
		System.out.println(" ConcreteObserver constructor. id=" + id);
	}
	
	public Integer getId(){
		return id;
	}

	public void notify(Message message) {
		System.out.println("Observer id = " + id + ". "
				+ message.getDescription() + ": " + message.getContent());
	}

}
