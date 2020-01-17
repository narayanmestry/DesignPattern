package com.bridgelabz.creationaldesignpattern.singleton;

class EagerInitializeSingletonApp {
	private static final EagerInitializeSingletonApp instance =  new EagerInitializeSingletonApp();
	public String e ;
	private EagerInitializeSingletonApp() {
	e = "I am Eager Instatiation ";
	}
	
	public static EagerInitializeSingletonApp getInstance()
	{
		
		return instance;
	
	}
	

}

