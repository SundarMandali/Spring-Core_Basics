package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
	@Value("Sundar")
	private String name;
	
	@Value("10")
	private int rollno;
	
	@Value("#{ListAddress}")
	private List<String> addresses;
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String name, int rollno, List<String> addresses) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.addresses = addresses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", addresses=" + addresses + "]";
	}
	
	
}
