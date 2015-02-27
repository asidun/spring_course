package com.spring.lesson1;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.lesson1.message.Message;

public class ConcreteObserver implements Observer{

	private Integer id;

	public ConcreteObserver() {
		final Random random = new Random();
		id = random.nextInt();
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
