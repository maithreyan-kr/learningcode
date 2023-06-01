package com.springPractice.SpringFrameWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class car implements vehicle
{
	@Autowired
	private tyre tyre;
	
	public tyre getTyre() {
		return tyre;
	}

	public void setTyre(tyre tyre) {
		this.tyre = tyre;
	}

	public void drive()
	{
		System.out.println("drive a car"+tyre);
	}

}
