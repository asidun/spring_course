package com.spring.lesson4_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config-lesson4_1.xml");
		
		context.registerShutdownHook(); 
					
		Subject subject = (Subject) context.getBean("concreteSubject");	
		subject.notifyObserver(new Person("Ivan"));
	}
}
