package com.springcore.spel;
import org.springframework.context.ApplicationContext;
import org.springframework.expression.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		
		System.out.println(d1);
		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		temp.parseExpression("#{2244}");
//		System.out.println(expression.getValue());
	}
	
}
