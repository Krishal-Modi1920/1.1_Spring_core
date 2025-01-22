package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // Load Spring application context
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");

        // Get the Person bean
        Person person1 = con.getBean("Person1", Person.class);
        
        // Print out the Person's properties
        System.out.println(person1);

        // Printing the class names of the collections
        System.out.println("person1.getFriends().getClass().getName(): " + person1.getFriends().getClass().getName());
        System.out.println("______________________________________________________________");
        System.out.println("person1.getFeestructure().getClass().getName(): " + person1.getFeestructure().getClass().getName());
        System.out.println("______________________________________________________________");
        System.out.println("person1.getProperties().getClass().getName(): " + person1.getProperties().getClass().getName());
    }
}
