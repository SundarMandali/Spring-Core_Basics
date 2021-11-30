package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanScope/ScopeConfig.xml");
	Prototype_Person obj1=context.getBean("p1",Prototype_Person.class);
	System.out.println(obj1.hashCode());
	
	Prototype_Person obj2=context.getBean("p1",Prototype_Person.class);
	
	System.out.println(obj2.hashCode());
}
}
