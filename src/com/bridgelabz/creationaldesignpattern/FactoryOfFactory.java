package com.bridgelabz.creationaldesignpattern;

public class FactoryOfFactory {

	public static void main(String[] args) {
	factoryOffactoryTest();
	}

	private static void factoryOffactoryTest() {
		Computer pc = com.bridgelabz.creationaldesignpattern.ComputerFactory.getComputer(new PCFactory("2 GB","16 GB","2.4 GHz"));
		Computer server = com.bridgelabz.creationaldesignpattern.ComputerFactory.getComputer(new ServerFactory("3 GB","12 GB","213 GHz"));
		System.out.println(" Pc Factory : "+pc);
		System.out.println("Server Factory "+server);
		
	
	}

}
