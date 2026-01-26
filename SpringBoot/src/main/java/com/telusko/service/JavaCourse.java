package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class JavaCourse implements ICourse
{

	public JavaCourse()
	{
		System.out.println("JavaCourse bean created");
	}
	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("Java Course is purchased and amount paid is : "+amount);
		return true;
	}

}
