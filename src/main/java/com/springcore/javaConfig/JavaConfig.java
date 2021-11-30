package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaConfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name= {"s1","temp","con"})
	public Student getStudent()
	{
		Student obj=new Student(getSamosa());
		return obj;
	}
}
