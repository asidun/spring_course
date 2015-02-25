package com.spring.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lesson1.message.Message;

/**
 * Created by olexandra on 23.02.15.
 */
public class Run {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		ConcreteSubject subject = context.getBean(ConcreteSubject.class);
		subject.notifyObserver(new Message("Subj", "DDD"));
	}
}
