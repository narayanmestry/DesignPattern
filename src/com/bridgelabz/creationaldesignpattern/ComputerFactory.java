package com.bridgelabz.creationaldesignpattern;

public class ComputerFactory {

	public static Computer getComputer(AbstractComputerFactory factory)
	{
		return factory.createComputer();
	}
}
