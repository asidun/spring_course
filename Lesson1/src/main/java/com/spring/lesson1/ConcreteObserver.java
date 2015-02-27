package com.spring.lesson1;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.lesson1.message.Message;

public class ConcreteObserver implements Observer, BeanPostProcessor, BeanNameAware, BeanFactoryAware {

	private Integer id;

	public ConcreteObserver() {
		final Random random = new Random();
		id = random.nextInt();
		System.out.println("Constructor. id=" + id);
	}
	
	public Integer getId(){
		return id;
	}

	@Override
	public void notify(Message message) {
		System.out.println("Observer id = " + id + ". "
				+ message.getDescription() + ": " + message.getContent());
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {		
		System.out.println("postProcessAfterInitialization. " + arg0.getClass().getName());
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return arg0;
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName. " + arg0);
		
	}
	
	public void init(){
		System.out.println("Init method");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		ConcreteSubject subject = (ConcreteSubject)arg0.getBean("concreteSubject");
		System.out.println("setBeanFactory. Subject = " + subject.toString());
		
	}

}
