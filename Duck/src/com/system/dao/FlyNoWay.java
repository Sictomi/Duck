package com.system.dao;

import com.system.idao.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly(){
		System.out.println("Can't fly!");
	}
}
