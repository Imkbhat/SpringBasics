package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		
		/*HelloWorld world = context.getBean("helloWorld", HelloWorld.class);
		System.out.println(world.getMessage());
		
		HelloWorld world2 = context.getBean("helloWorld1", HelloWorld.class);
		System.out.println(world2.getMessage());
		
		boolean equal1 = world == world2;
		boolean equal2 = world.equals(world2);*/
		
		//System.out.println("Equal1===>"+equal1 +"======Equal2======>"+equal2);
		
		//initially I had created like this
		
		HelloWorld world1 = context.getBean("helloWorld", HelloWorld.class);
		HelloWorld world2 = context.getBean("helloWorld", HelloWorld.class);
		
		System.out.println("Equality Check==>"+world1.equals(world2));
		
		
	}

}
