package com.bridgelabz.creationaldesignpattern.singleton;

public class BillPugInstatiation {
	public String s ;
	public BillPugInstatiation() {
		s = "I am BillPugeInstantiation...";}
	
	private static class SingletonHelper
	{
		private static final BillPugInstatiation instance = new BillPugInstatiation();
	}
	
	public static BillPugInstatiation getinstance()
	{
		return SingletonHelper.instance;		
	}
	
	
}
