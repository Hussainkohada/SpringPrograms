package com.testSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

//when using @component 
/*Also we can use @Service-For Service related calls
				@Repository-For Passing or Obtaining Data
				@Controller For Controller related applications in MVC*/
@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
private Point center;
//For Message Source instance in this class
private ApplicationEventPublisher publisher;
//For MessageSource
private MessageSource messageSource;
public Point getCenter() {
	return center;
}

/*@Autowired
@Qualifier("circleRelated")
public void setCenter(Point center) {
	this.center = center;
}*/
//@Required
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



public MessageSource getMessageSource() {
	return messageSource;
}
@Autowired
public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
}

public String display(){
	//String str="The Center Co-ordinates of Circle are: \nX = "+center.getX()
		//	+" Y = "+center.getY() ;

	//For Message Source instance-1st arg=Property key name;2nd arg=Property parameter Object array
								//3rd arg=Default Message if no key with given property name is there,4th arg=Locale
	String str=(this.getMessageSource().getMessage("greeting",null,"Oops Dint find greeting!!!",null))+"\n"+
			this.getMessageSource().getMessage("pointParam",new Object[]{center.getX(),center.getY()},"Didn't find pointParam",null);
	//MyEventPublisher
	MyEventPublisher eventPublisher=new MyEventPublisher(this);
	publisher.publishEvent(eventPublisher);
	return str;
}

@Override     //of interface ApplicationPublisherAware 
public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
this.publisher= publisher;
}
}
