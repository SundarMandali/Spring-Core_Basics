package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/StandaloneConfig.xml");
		Person obj1=(Person) context.getBean("p1");
		Person obj2=(Person) context.getBean("p2");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(obj1.getFriends().getClass().getName());
		System.out.println(obj2.getFriends().getClass().getName());
		System.out.println(obj1.getFeestructure().getClass().getName());
		System.out.println(obj1.getProperties().getClass().getName());
	}

}
