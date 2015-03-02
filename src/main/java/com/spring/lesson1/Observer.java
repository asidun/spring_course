package com.spring.lesson1;

import com.spring.lesson1.message.Message;

public interface Observer {

	void notify(Message message);

	Integer getId();

}