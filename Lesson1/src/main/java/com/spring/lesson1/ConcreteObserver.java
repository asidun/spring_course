package com.spring.lesson1;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.lesson1.message.Message;

public class ConcreteObserver implements Observer, ApplicationContextAware{

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

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		MyBeanClass myBeanAddWithDef1 = applicationContext.getBean("myBeanAddWithDef", MyBeanClass.class);
		myBeanAddWithDef1.printClassId();
		
	}

}
