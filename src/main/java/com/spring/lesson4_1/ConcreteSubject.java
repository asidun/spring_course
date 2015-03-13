package com.spring.lesson4_1;
import java.util.LinkedList;
import java.util.List;


import org.springframework.context.ApplicationEventPublisher;
import com.spring.lesson4_1.Person;

public class ConcreteSubject implements Subject{
        private final List<Observer> observers = new LinkedList<Observer>();
        private ApplicationEventPublisher applicationEventPublisher;

        public void notifyObserver(Person person){
                for (Observer observer : observers) {
                        observer.notify(person);
                }
        }
        
        public void unregister(Observer observer){
                observers.remove(observer);
        }
        
        public void register(Observer observer){
                observers.add(observer);
        }	
			
        public ConcreteSubject(List<Observer> observers){
        	for (Observer obs : observers) {
				register(obs);
			}
        }
}
