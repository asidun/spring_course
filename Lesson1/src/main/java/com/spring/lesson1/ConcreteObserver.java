package com.spring.lesson1;

import java.util.Random;

import com.spring.lesson1.message.Message;

public class ConcreteObserver implements Observer {

	private Integer id;

	public ConcreteObserver() {
		final Random random = new Random();
		id = random.nextInt();
	}

	@Override
	public void notify(Message message) {
		System.out.println("Observer id = " + id + ". "
				+ message.getDescription() + ": " + message.getContent());
	}

}
