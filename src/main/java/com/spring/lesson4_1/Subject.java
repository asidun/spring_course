package com.spring.lesson4_1;
import com.spring.lesson4_1.Person;

public interface Subject {
    public void notifyObserver(Person person);
    public void unregister(Observer observer);
    public void register(Observer observer);
}
