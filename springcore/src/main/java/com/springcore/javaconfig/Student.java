package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component // @ Component is used to mark the class as a spring bean (Stereotype)
public class Student {

    private Samosa samosa;

    // Constructor injection
    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        System.out.println("Student is Studying");
    }

    @Override
    public String toString() {
        return "Student with Samosa: " + samosa;
    }
}
