package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingleton {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanScope/ScopeConfig.xml");
		Singleton_Student obj1=context.getBean("s1",Singleton_Student.class);
		System.out.println(obj1.hashCode());
		
		Singleton_Student obj2=context.getBean("s1",Singleton_Student.class);
		System.out.println(obj2.hashCode());
		
		
		
	}

}
