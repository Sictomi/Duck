package com.system.dao;

import com.system.idao.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack(){
		System.out.println("MuteQuack");
	}

}