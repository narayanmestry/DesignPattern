package com.bridgelabz.creationaldesignpattern;

public class ComputerFactoryApp {
	public static Computer getComputer(String type , String RAM , String HDD , String CPU)
	{
		if("Pc".equalsIgnoreCase(type))
		{
			return new PC(RAM,HDD,CPU);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(RAM,HDD,CPU);
		}
		
		return null;
		
	}
	
}
