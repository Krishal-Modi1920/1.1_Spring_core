package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones; // Wrapper Class 
	private Set<String> address; // Wrapper Class
	private Map<String, String> courses; // Wrapper Class
	
	// Constructor
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	// Constructor From Super Class
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Printing Method
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}


	
	
	
}
