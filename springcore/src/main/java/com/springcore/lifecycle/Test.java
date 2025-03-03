package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		// AbstractApplicationContext is used for shut down of life cycle and the method used is registerShutdownHook();
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook(); // Shut Down context
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}
}
