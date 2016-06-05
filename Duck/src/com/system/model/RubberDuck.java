package com.system.model;

import com.system.dao.FlyNoWay;
import com.system.dao.MuteQuack;

public class RubberDuck extends Duck {
	public RubberDuck(){
		setQuackBehavior(new MuteQuack());	
		setFlyBehavior(new FlyNoWay());		
	}
	@Override
	public void display(){
		System.out.println("I am RubberDuck.");
	}
}