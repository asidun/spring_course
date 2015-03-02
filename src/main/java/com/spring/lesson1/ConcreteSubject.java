package com.spring.lesson1;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.lesson1.message.Message;
import com.spring.lesson1.messaging.Person;
import com.spring.lesson1.messaging.PersonEvent;

public class ConcreteSubject implements Subject, ApplicationEventPublisherAware{
        private final List<Observer> observers = new LinkedList<Observer>();
        private ApplicationEventPublisher applicationEventPublisher;

        public void notifyObserver(Person person){
                for (Observer observer : observers) {
                        observer.notify(person);
                }
        }
        
        public void notifyObserverByEvent(Person person){
        	applicationEventPublisher.publishEvent(new PersonEvent(person));
        }
        
        public void unregister(Observer observer){
                observers.remove(observer);
        };
        public void register(Observer observer){
                observers.add(observer);
        }	
			
        public ConcreteSubject(List<Observer> observers){
        	for (Observer obs : observers) {
				register(obs);
			}
        }
		@Override
		public void setApplicationEventPublisher(
				ApplicationEventPublisher applicationEventPublisher) {
			this.applicationEventPublisher = applicationEventPublisher;
			
		}
}
