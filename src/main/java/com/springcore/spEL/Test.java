package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spEl/spELconfig.xml");
	Demo obj=context.getBean("d1",Demo.class);
		System.out.println(obj);
		
		
		
		//We can Directly Use an Expression using "SpelExpressionParser" class and "Expression" class
		
		SpelExpressionParser temp=new SpelExpressionParser();
		
		Expression ex=temp.parseExpression("22+10");
		System.out.println(ex.getValue());
	}

}
