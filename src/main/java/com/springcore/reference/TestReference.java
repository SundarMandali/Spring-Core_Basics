package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/referenceConfig.xml");
	Employee obj=(Employee)context.getBean("emp");
	System.out.println(obj.getEmpname());
	System.out.println(obj.getAddress());
	
	
	
}
}
