package com.testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
public class Main {
	public static void main(String[] args) {	
		
//ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
/*HelloWorld obj1=(HelloWorld)context.getBean("helloHussain");
System.out.println(obj1.sendmsg());
HelloWorld obj2=(HelloWorld)context.getBean("newMessage");
System.out.println(obj2.sendmsg());*/	
		
/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
HelloWorld obj=(HelloWorld)context.getBean("getTrianglePoints");
System.out.println(obj.toString());*/
		//Inheritance
/*HelloWorld obj=(HelloWorld)context.getBean("triangle1");
System.out.println(obj.toString());*/
		//Inheritance Collections
/*HelloWorld obj=(HelloWorld)context.getBean("triangle2");
System.out.println(obj.toString());*/		
		//Coding to Interface
/*ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
Shape shapeobj=(Shape)context.getBean("getCirclePoints");
System.out.println(shapeobj.display());*/
		//Below code for init and destroy method of JSR-250 Config
/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
context.registerShutdownHook();
Shape shapeobj=(Shape)context.getBean("getCirclePoints");
System.out.println(shapeobj.display());*/
		//Below Code For Component Scan
AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
context.registerShutdownHook();
Shape shapeobj=(Shape)context.getBean("circle");
System.out.println(shapeobj.display());
	


}
}
