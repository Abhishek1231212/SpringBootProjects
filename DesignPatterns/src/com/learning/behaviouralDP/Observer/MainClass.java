package com.learning.behaviouralDP.Observer;



public class MainClass {
	public static void main(String[] args) {
		
		
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber sub1 = new Subscriber("Sub1");
		Subscriber sub2 = new Subscriber("Sub2");
		
		channel.subscribe(sub1);
		channel.subscribe(sub2);
		
		channel.notifyChanges("Title1");
		channel.notifyChanges("Title2");
	}
}
