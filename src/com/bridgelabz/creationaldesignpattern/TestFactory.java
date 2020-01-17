package com.bridgelabz.creationaldesignpattern;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactoryApp.getComputer("pc","3 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactoryApp.getComputer("server", "16 GB", "1 TB", "5 GHz");
		System.out.println("Config for PC :"+pc);
		System.out.println("Comfig for Server :"+server);

	}

}
