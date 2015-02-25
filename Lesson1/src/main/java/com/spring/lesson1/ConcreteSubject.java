package com.spring.lesson1;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import com.spring.lesson1.message.Message;

public class ConcreteSubject implements Subject{
		@Resource(name="observerList")
        List<Observer> observers;

        public void notifyObserver(Message message){
                for (Observer observer : observers) {
                        observer.notify();
                }
        }
        public void unregister(Observer observer){
                observers.remove(observer);
        };
        public void register(Observer observer){
                observers.add(observer);
        }
}
