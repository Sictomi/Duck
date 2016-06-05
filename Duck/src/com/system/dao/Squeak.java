package com.system.dao;

import com.system.idao.QuackBehavior;

public class Squeak implements QuackBehavior {
	@Override
	public void quack(){
		System.out.println("Squeak!");
	}
}