package com.testSpring;

import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class HelloWorld implements ApplicationContextAware,BeanNameAware{
	
	//For Code to Interface use the below line
	public class HelloWorld implements Shape{
/*public String myMessage;
public int age;*/

/*public String getMyMessage() {
	return myMessage;
}
*/

/*
public void setMyMessage(String myMessage) {
	this.myMessage = myMessage;
}*/

/*public HelloWorld(String myMessage) {
	super();
	this.myMessage = myMessage;
}


public HelloWorld(String myMessage, int age) {
	super();
	this.myMessage = myMessage;
	this.age = age;
}


public String sendmsg(){
	return myMessage+"  and age is "+age;
}*/

	public Point pointA;
	public Point pointB;
	public Point pointC;
	public ApplicationContext context;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public String display(){
		String str="Point A -> x= "+pointA.getX()+" y= "+pointA.getY()+
				"\nPoint B -> x= "+pointB.getX()+" y= "+pointB.getY()+
				"\nPoint C -> x= "+pointC.getX()+" y= "+pointC.getY();
		return str;
	}
	}
/*public class HelloWorld implements InitializingBean,DisposableBean{
	List<Point> listOfPoints=new ArrayList<>();

	public List<Point> getListOfPoints() {
		return listOfPoints;
	}

	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}
	public void print() {int i=1;
		for(Point point:listOfPoints){
			System.out.println("Point "+i+" X="+point.getX()+" Y="+point.getY());
		i++;
		}
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("Calling the init method");
	}
	

	@Override
	public void destroy() throws Exception {
	System.out.println("Destroying the bean");
		
	}*/
/*public class HelloWorld {
	List<Point> listOfPoints=new ArrayList<>();

	public List<Point> getListOfPoints() {
		return listOfPoints;
	}

	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}
	public void print() {int i=1;
		for(Point point:listOfPoints){
			System.out.println("Point "+i+" X="+point.getX()+" Y="+point.getY());
		i++;
		}
		
	}

public void myInit(){
	System.out.println("Calling the Custom initializing Method");
}
public void cleanUp(){
	System.out.println("Calling the Custom disposable Method");
}
	*/	

