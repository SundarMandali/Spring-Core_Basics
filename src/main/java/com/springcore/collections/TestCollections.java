package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
	Employee obj=(Employee)context.getBean("Emp");
	System.out.println(obj.getName());
	System.out.println(obj.getPhones());
	System.out.println(obj.getAddress());
	System.out.println(obj.getCourses());
	System.out.println(obj.getDetails());

	
}
}
