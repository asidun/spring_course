package com.spring.lesson4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config-lesson4.xml");
		
		context.registerShutdownHook(); 
					
		Bean bean = (Bean) context.getBean("myBean");		
		bean.aboutBean();
		
	}
}
