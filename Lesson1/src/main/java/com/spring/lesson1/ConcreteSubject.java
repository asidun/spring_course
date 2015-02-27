package com.spring.lesson1;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.lesson1.message.Message;

public class ConcreteSubject implements Subject, ApplicationContextAware{
        List<Observer> observers = new LinkedList<Observer>();

        public void notifyObserver(Message message){
                for (Observer observer : observers) {
                        observer.notify(message);
                }
        }
        public void unregister(Observer observer){
                observers.remove(observer);
        };
        public void register(Observer observer){
                observers.add(observer);
        }
		@Override
		public void setApplicationContext(ApplicationContext applicationContext)
				throws BeansException {
			for (int i = 0; i <= 3; i++) {
				register(applicationContext.getBean("observerAddWithDef", ConcreteObserver.class));				
			}		
			
		}
}
