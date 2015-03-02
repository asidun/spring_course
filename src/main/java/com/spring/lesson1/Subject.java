package com.spring.lesson1;
import com.spring.lesson1.message.Message;

public interface Subject {
    public void notifyObserver(Message message);
    public void unregister(Observer observer);
    public void register(Observer observer);
}
