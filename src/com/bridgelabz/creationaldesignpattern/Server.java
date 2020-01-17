package com.bridgelabz.creationaldesignpattern;

public  class Server extends Computer {
	private String RAM;
	private String HDD;
	private String CPU;
	
	public Server(String RAM , String HDD, String CPU)
	{
		this.RAM = RAM;
		this.HDD = HDD;
		this.CPU = CPU;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	
	
}
