package com.spring.lesson1;

import java.util.Random;

import com.spring.lesson1.message.Message;

public class MyBeanClass {
	
	private Integer id;

	public MyBeanClass() {
		final Random random = new Random();
		id = random.nextInt();
		System.out.println("MyBeanClass constructor. id=" + id);
	}
	
	public Integer getId(){
		return id;
	}

	public void printClassId() {
		System.out.println("Id = " + id );
	}

}
