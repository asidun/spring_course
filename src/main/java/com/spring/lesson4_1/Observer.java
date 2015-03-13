package com.spring.lesson4_1;

import com.spring.lesson4_1.Person;

public interface Observer {

	void notify(Person person);

	Integer getId();

}