package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/constructorConfig.xml");
	Person obj=(Person)context.getBean("person");
	System.out.println(obj);
	
	//Example of Ambiguity using Addition
	System.out.println("----------Example of Ambiguity using Addition---------");
	Addition obj1=(Addition)context.getBean("adder");
	obj1.sum();
}
}
