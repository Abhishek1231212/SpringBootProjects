package com.learning.creationalDP.Factory;



public class CarFactory {
	
	public static Car getCar(String model) {
		String carModel = model.trim();
		switch(carModel) {
		case "Audi": return new Audi();
		case "BMW": return new BMW();
		default: return null;
		}
	}
}
