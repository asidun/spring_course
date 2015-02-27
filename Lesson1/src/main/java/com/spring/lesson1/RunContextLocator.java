package com.spring.lesson1;

import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextSingletonBeanFactoryLocator;

public class RunContextLocator {

	public static void main(String[] args){
		callContext("first");
		callContext("second");
	}

	private static void callContext(String string) {
		BeanFactoryLocator bfl = ContextSingletonBeanFactoryLocator.getInstance();
		BeanFactoryReference bf = bfl.useBeanFactory("mainContext");
		
		Observer observer1 = (Observer) bf.getFactory().getBean("observer");		
		System.out.println("ContextFactory " + string + ". " + observer1.getId());
		
	}
	
}
