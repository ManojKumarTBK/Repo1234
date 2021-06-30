package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
		
	System.out.println("Employee object constructor");
		
	}
	private String name;
	private long id;
	private String dept;	
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void show() {
		System.out.println("in  employee show method");
		address.showaddress();
	}

}
