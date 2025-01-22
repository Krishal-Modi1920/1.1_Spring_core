package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    
    private Address address;

    // Constructor Injection (Optional)
    @Autowired
    public Emp(Address address) {
        this.address = address;
    }

    // Setter Injection (If you prefer setter injection)
    // @Autowired
    // public void setAddress(Address address) {
    //     this.address = address;
    // }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Emp [address=" + address + "]";
    }
}
