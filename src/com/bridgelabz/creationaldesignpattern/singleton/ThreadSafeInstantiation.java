package com.bridgelabz.creationaldesignpattern.singleton;

public class ThreadSafeInstantiation {
	private static ThreadSafeInstantiation instance ;
	public String s ;
	private ThreadSafeInstantiation() {
		s = "I am Thread Safe Singleton"; 
	}
	
	public static ThreadSafeInstantiation getInstance()
	{
		if(instance == null)
		{
			synchronized (ThreadSafeInstantiation.class) {
				if(instance==null)
				{
					instance = new ThreadSafeInstantiation();
				}
			}
		}
		return instance;
	}
}
