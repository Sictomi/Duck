package com.system.action;

import java.util.Scanner;
import com.system.model.Duck;
import com.system.model.MallardDuck;
import com.system.model.RedheadDuck;
import com.system.model.RubberDuck;


public class DuckSimulator {
	private static Scanner dk;

	public static void main(String[] args){
		System.out.println("Which duck do you want to know about?");
		dk = new Scanner(System.in);
		String duck = dk.next();
		dk.close();
		
		if(duck.equals("MallardDuck")){
			System.out.println("MallardDuck");
			Duck mallardDuck = new MallardDuck();
			mallardDuck.display();
			mallardDuck.swim();
			mallardDuck.performFly();
			mallardDuck.performQuack();
		}
		if(duck.equals("RedheadDuck")){
			System.out.println("RedheadDuck");
			Duck redheadDuck = new RedheadDuck();
			redheadDuck.display();
			redheadDuck.swim();
			redheadDuck.performFly();
			redheadDuck.performQuack();
		}
		if(duck.equals("RubberDuck")){
			System.out.println("RubberDuck");
			Duck rubberDuck = new RubberDuck();
			rubberDuck.display();
			rubberDuck.swim();
			rubberDuck.performFly();
			rubberDuck.performQuack();
		}
	}
}
