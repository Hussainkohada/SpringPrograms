package com.testSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//when using @component 
@Component
public class Circle implements Shape{
private Point center;

public Point getCenter() {
	return center;
}

/*@Autowired
@Qualifier("circleRelated")
public void setCenter(Point center) {
	this.center = center;
}*/
/*@Resource(name="pointC")*/
@Resource
public void setCenter(Point center) {
	this.center = center;
}


//Below Code is for init and destroy method of JSR-250 Annotations
@PostConstruct
public void initializingBean(){
	System.out.println("Initialised The Bean");
}
@PreDestroy
public void destroyingBean(){
	System.out.println("Destroyed The Bean");
}


public String display(){
	String str="The Center Co-ordinates of Circle are: \nX = "+center.getX()
			+" Y = "+center.getY() ;
	return str;
	
}
}
