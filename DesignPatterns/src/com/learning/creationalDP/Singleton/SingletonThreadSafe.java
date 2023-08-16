package com.learning.creationalDP.Singleton;



public class SingletonThreadSafe extends Thread{
	private static SingletonThreadSafe singletonThreadSafe;
	
	private SingletonThreadSafe() {}
	
	public static SingletonThreadSafe getSingletonThreadSafeObject() {
		
		if(singletonThreadSafe==null) {
			synchronized(SingletonThreadSafe.class) {
				singletonThreadSafe = new SingletonThreadSafe();
			}
		}
		return singletonThreadSafe;
	}
}
