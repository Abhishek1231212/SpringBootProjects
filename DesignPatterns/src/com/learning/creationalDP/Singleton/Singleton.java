package com.learning.creationalDP.Singleton;

public class Singleton {
	private static Singleton singleton;

	// private constructor is to create object only with the objects not with
	// constructor.
	// If we have the constructor public we can create many object so the Singleton
	// DP not exists.
	private Singleton() {
	}

//static method is the call method without creating the object.
	public static Singleton getSingleton() {

		// Every time when we call the method it will check if object exists
		// If not, it will create the object and return the object.
		// Else, it will return the object which exists
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}

}
