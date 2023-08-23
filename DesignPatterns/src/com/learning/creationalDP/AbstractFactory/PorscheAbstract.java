package com.learning.creationalDP.AbstractFactory;

public class PorscheAbstract extends CarAbstractFactory{

	@Override
	Car getCar() {
		return new Porsche();
	}

}
