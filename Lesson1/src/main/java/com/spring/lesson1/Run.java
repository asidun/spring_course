package com.spring.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lesson1.message.Message;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		Subject concreteSubject = context.getBean(ConcreteSubject.class);
		Observer observer1 = (Observer) context.getBean("observer");
		Observer observer2 = (Observer) context.getBean("observer");
		Observer observer3 = (Observer) context.getBean("observer");
		concreteSubject.register(observer1);
		concreteSubject.register(observer2);
		concreteSubject.register(observer3);
		concreteSubject.notifyObserver(new Message("Subj", "DDD"));
	}
}
