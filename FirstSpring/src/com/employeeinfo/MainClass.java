package com.employeeinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp1 = (Employee)context.getBean("employee1");
		System.out.println(emp1.toString());
		
		Employee emp2 = (Employee)context.getBean("employee2");
		System.out.println(emp2.toString());
		
		Employee emp3 = (Employee)context.getBean("employee3");
		System.out.println(emp3.toString());
		
		Employee emp4 = (Employee)context.getBean("employee4");
		System.out.println(emp4.toString());
		

	}

}
