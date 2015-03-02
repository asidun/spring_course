package com.spring.lesson1;

import com.spring.lesson1.messaging.Person;

public interface Observer {

	void notify(Person person);

	Integer getId();

}