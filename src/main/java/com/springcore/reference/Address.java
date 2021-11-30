package com.springcore.reference;

public class Address {
	private String village;
	private String city;
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String village, String city) {
		super();
		this.village = village;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + "]";
	}
	
	
}
