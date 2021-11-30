package com.springcore.beanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Singleton_Student {
	@Value("22")
	private int stud_id;
	@Value("Sundar")
	private String name;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Singleton_Student(int stud_id, String name) {
		super();
		this.stud_id = stud_id;
		this.name = name;
	}
	public Singleton_Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Singleton_Student [stud_id=" + stud_id + ", name=" + name + "]";
	}
	
}
