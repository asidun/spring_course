package com.spring.lesson1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lesson1.message.Message;

public class Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		context.registerShutdownHook(); 
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
		
		GenericBeanDefinition beanDef = new GenericBeanDefinition();
		//beanDef.setInitMethodName("printClassId");
		beanDef.setBeanClass(ConcreteObserver.class);
		beanDef.setLazyInit(false);
		beanDef.setAbstract(false);
		beanDef.setAutowireCandidate(true);
		beanDef.setScope("prototype");
		beanFactory.registerBeanDefinition("observerAddWithDef", beanDef);
					
		Subject subject = (Subject) context.getBean("concreteSubject");
		Message message = new Message("Message", "Aware bean");
		subject.notifyObserver(message );
	}
}
