package com.spring.lesson1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lesson1.message.Message;
import com.spring.lesson1.messaging.Person;

public class Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		context.registerShutdownHook(); 
					
		Subject subject = (Subject) context.getBean("concreteSubject");		
		subject.notifyObserverByEvent(new Person("Ivan"));
		//subject.notifyObserverByEvent(new Person("Petr"));
	}
}
