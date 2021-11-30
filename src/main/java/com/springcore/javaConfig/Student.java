package com.springcore.javaConfig;

import org.springframework.stereotype.Component;

//@Component("s1")
public class Student {

	private Samosa samosa;
	public void studentDisplay()
	{
		samosa.displaySamosa();
		System.out.println("Hey I am a Student");
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	
}
