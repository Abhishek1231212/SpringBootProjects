package com.learning.creationalDP.Singleton;

public class SingletonImpl {
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); can't call. Because of private constructor.
		
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();
		System.out.println(obj1.hashCode());//Code: 488970385
		System.out.println(obj2.hashCode());//Code: 488970385
		//Note: This is the lazy way of implementing Singleton DP.
		
		//Eager Way
		SingletonEager singletonEager1 = SingletonEager.getSingletonEager();
		SingletonEager singletonEager2 = SingletonEager.getSingletonEager();
		
		System.out.println(singletonEager1.hashCode());//1134712904
		System.out.println(singletonEager2.hashCode());//1134712904
		
		//Note: But lazy, eager ways are not thread oriented
	}
}
