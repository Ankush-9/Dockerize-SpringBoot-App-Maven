package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Telusko 
{
	
	private ICourse course;
	
	
	public Telusko() {
		super();
		System.out.println("Telusko Bean created");
	}
	public Telusko(ICourse course)
	{
		super();
		System.out.println("Constructor injection");
		this.course = course;
	}

	@Autowired
	@Qualifier("devOpsCourse")
	public void setCourse(ICourse course) //ICourse course =new JavCourse();
	{
		System.out.println("setter injection");
		this.course = course;
	}


	public boolean buyTheCourse(double amount)
	{
		
		return course.getTheCourse(amount);
		
	}

}
