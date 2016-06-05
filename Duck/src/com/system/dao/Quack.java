package com.system.dao;

import com.system.idao.QuackBehavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack(){
		System.out.println("Quack");
	}
}
