package com.everis.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class SpringMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		MainFactory mainFactory = (MainFactory) context.getBean("mainFactory");				
		mainFactory.testDevices();
		
	}
}
