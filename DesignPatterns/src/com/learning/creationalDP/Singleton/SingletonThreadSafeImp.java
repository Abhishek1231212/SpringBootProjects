package com.learning.creationalDP.Singleton;



public class SingletonThreadSafeImp {
	public static void main(String[] args) {
		SingletonThreadSafe singletonThreadSafe1 =  SingletonThreadSafe.getSingletonThreadSafeObject();
		SingletonThreadSafe singletonThreadSafe2 =  SingletonThreadSafe.getSingletonThreadSafeObject();
		
		System.out.println(singletonThreadSafe1.hashCode());
		System.out.println(singletonThreadSafe2.hashCode());
		
		singletonThreadSafe1.run();
	}
}
