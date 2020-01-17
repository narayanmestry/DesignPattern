package com.bridgelabz.creationaldesignpattern.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance ;
	public static String s ;
	private StaticBlockSingleton() {
		s = "I am Static Block Singlton";
	}
	static {
		try
		{
			instance = new StaticBlockSingleton();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static StaticBlockSingleton getInstance()
	{
		return instance;
		
	}
}
