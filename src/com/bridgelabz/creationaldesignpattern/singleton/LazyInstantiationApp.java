package com.bridgelabz.creationaldesignpattern.singleton;

public class LazyInstantiationApp {
	private static LazyInstantiationApp instance;
	String s = "I am Lazy instantiation ";
	private LazyInstantiationApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static LazyInstantiationApp getInstance()
	{
		if(instance==null)
		{
			instance = new LazyInstantiationApp();
		}
		return instance;
	}
	
}
