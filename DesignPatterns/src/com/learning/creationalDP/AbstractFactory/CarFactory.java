package com.learning.creationalDP.AbstractFactory;



public class CarFactory {
	public static Car getCar(CarAbstractFactory carAbstractFactory) {
		return carAbstractFactory.getCar();
	}
}
