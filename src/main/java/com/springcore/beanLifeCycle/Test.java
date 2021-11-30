package com.springcore.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanLifeCycle/BeanLifeCycleConfig.xml");
	
//		Samosa obj=(Samosa)context.getBean("s1");
//		System.out.println(obj);
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		Pepsi obj2=(Pepsi)context.getBean("p1");
//		System.out.println(obj2);
		Exam obj3=(Exam)context.getBean("e1");
		System.out.println(obj3);
		context.registerShutdownHook();
	}

}
