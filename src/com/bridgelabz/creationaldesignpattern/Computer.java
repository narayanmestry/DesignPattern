package com.bridgelabz.creationaldesignpattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString()
	{
		return "\n\tRAM : "+this.getRAM()+"\n\tHDD : "+this.getHDD()+"\n\tCPU : "+this.getCPU();
	}
}
