package com.productinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Product prod1 = (Product)context.getBean("product1");
		prod1.display();
		
		Product prod2 = (Product)context.getBean("product2");
		prod2.display();
		
		Product prod3 = (Product)context.getBean("product3");
		prod3.display();
	}

}
