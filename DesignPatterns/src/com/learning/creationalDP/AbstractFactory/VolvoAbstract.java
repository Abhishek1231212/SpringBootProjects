package com.learning.creationalDP.AbstractFactory;



public class VolvoAbstract extends CarAbstractFactory{

	@Override
	Car getCar() {
		return new Volvo();
	}

}
