// Works exactly like a config.xml file but in java 
package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   // This means class contains method that define beans, which spring will manage 
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }

    @Bean(name = {"student", "temp", "con"})
    public Student getStudent() {
        return new Student(getSamosa());  // Constructor injection
    }
}