package com.testSpring;

import org.springframework.context.ApplicationEvent;

public class MyEventPublisher extends ApplicationEvent {

	public MyEventPublisher(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "Published Draw Event";
	}

}
