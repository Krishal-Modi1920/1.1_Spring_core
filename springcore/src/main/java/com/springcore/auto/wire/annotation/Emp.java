package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    private Address address;

    // Constructor-based injection
    @Autowired
    public Emp(@Qualifier("temp1") Address address) // @Qualifier indicates that which bean to injects when there are multiple beans in the same file (means here we are injecting temp bean)
    {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [address=" + address + "]";
    }
}
