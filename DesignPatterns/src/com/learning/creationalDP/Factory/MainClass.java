package com.learning.creationalDP.Factory;



public class MainClass {

	public static void main(String[] args) {
		Car car1 = CarFactory.getCar("Audi");
		System.out.println(car1.info());
		
		Car car2 = CarFactory.getCar("BMW");
		System.out.println(car2.info());
	}

}
