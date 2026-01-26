package com.telusko.service;


import org.springframework.stereotype.Service;

@Service
public class DevOpsCourse implements ICourse 
{

	public DevOpsCourse()
	{
		System.out.println("DevOpsCourse bean created");
	}
	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("DevOps Course is purchased and amount paid is : "+amount);
		return true;
	}

}
