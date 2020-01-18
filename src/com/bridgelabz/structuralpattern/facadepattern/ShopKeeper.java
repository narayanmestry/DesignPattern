package com.bridgelabz.structuralpattern.facadepattern;

public class ShopKeeper {
	
	private MobileShop iPhone;
	private MobileShop samsung;
	
	public ShopKeeper()
	{
		iPhone=new Iphone();
		samsung=new Samsung();
	}
	
	public void iPhoneSale()
	{
		// TODO Auto-generated method stub
		iPhone.modelNo();
		iPhone.price();
	}
	
	public void samsungSale() {
		// TODO Auto-generated method stub
		samsung.modelNo();
		samsung.price();
	}
}