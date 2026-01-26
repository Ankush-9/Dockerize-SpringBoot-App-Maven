package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class SpringBootCourse implements ICourse 
{
	public SpringBootCourse()
	{
		System.out.println("SpringBootCourse bean created");
	}

	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("SpringBoot Course is purchased and amount paid is : "+amount);
		return true;
	}

}
