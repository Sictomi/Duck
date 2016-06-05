package com.system.dao;

import com.system.idao.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly(){
		System.out.println("Fly with Wings!");
	}
}