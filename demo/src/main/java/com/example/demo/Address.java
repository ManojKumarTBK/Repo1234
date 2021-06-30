package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String streetname,city,state;
	private Long pincode;

	public Address() {
		// TODO Auto-generated constructor stub
		System.out.println("Address obejct constrictor");		
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	public void showaddress() {
		System.out.println("this is amy employee adress");
	}
	
	

}
