package com.learning.behaviouralDP.Observer;



public class Subscriber implements Observer{
	String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	@Override
	public void notified(Observer ob, String title) {
		System.out.println("Hello "+this.name +", Video Uploaded. Title: " + title);
	}

}
