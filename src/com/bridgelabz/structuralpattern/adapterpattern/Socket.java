package com.bridgelabz.structuralpattern.adapterpattern;

public class Socket {
	public Volt getVolt()
	{
		return new Volt(120);
		
	}
}
