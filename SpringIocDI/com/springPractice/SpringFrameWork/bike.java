package com.springPractice.SpringFrameWork;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle
{
	public void drive()
	{
		System.out.println("drive a bike");
	}

}
