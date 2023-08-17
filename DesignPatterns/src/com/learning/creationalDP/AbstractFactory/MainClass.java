package com.learning.creationalDP.AbstractFactory;


public class MainClass {

	public static void main(String[] args) {
		
		Car c1 = CarFactory.getCar(new PorscheAbstract());
		Car c2 = CarFactory.getCar(new VolvoAbstract());
		c1.info();
		c2.info();
		
	}

}
