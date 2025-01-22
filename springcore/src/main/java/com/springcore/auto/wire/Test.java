package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");

        // Retrieve Emp bean
        Emp emp1 = context.getBean("emp1", Emp.class);

        // Print Emp object details
        System.out.println(emp1);
        
    }
}
