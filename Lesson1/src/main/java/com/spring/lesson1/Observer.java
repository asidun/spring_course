package com.spring.lesson1;

import com.spring.lesson1.message.Message;

public interface Observer {

	public abstract void notify(Message message);

}