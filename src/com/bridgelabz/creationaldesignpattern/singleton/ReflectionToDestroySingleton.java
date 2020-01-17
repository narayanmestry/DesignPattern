package com.bridgelabz.creationaldesignpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionToDestroySingleton {

	public static void main(String[] args) {
		EagerInitializeSingletonApp instanceOne = EagerInitializeSingletonApp.getInstance();
		EagerInitializeSingletonApp instanceTwo = EagerInitializeSingletonApp.getInstance();  // GEt same instance like instanceOne
		System.out.println("Before : "+instanceOne.hashCode());   // same hashcode   :  2074407503
		System.out.println("Before : "+instanceTwo.hashCode());   // same  :  2074407503

		try {
			Constructor[] constructors = EagerInitializeSingletonApp.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Now below code will Destroy the SingleTon Pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializeSingletonApp) constructor.newInstance();  // Get different instace 
				break ;
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After : "+instanceOne.hashCode());  // both are Different ..  2074407503
		System.out.println("After : "+instanceTwo.hashCode());  //							  999966131


	}

}
