package com.spring.lesson1;
import com.spring.lesson1.message.Message;
import com.spring.lesson1.messaging.Person;

public interface Subject {
    public void notifyObserver(Person person);
    public void unregister(Observer observer);
    public void register(Observer observer);
	public void notifyObserverByEvent(Person person);
}
