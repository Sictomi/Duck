package com.system.model;

import com.system.dao.FlyWithRocket;
import com.system.dao.Squeak;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		setQuackBehavior(new Squeak());	
		setFlyBehavior(new FlyWithRocket());		
	}
	@Override
	public void display(){
		System.out.println("I am RedheadDuck.");
	}
}