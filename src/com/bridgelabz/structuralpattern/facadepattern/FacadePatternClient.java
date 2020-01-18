package com.bridgelabz.structuralpattern.facadepattern;

import com.bridgelabz.utility.Utility;

public class FacadePatternClient {

	public static void main(String[] args) {
		System.out.println("Welcome to Mobile Shop .....");
		System.out.println("What you want ? Enter your choice ..");
		System.out.println("\t\t1.IPhone :");
		System.out.println("\t\t2.samsung :");
		int ch = Utility.inputNumber();
		
		ShopKeeper shopkeeper = new ShopKeeper();
		

		switch(ch)
		{
		case 1 : shopkeeper.iPhoneSale();
			break;
		case 2 : shopkeeper .samsungSale();
			break;

		default :
			System.out.println("Enter the Proper choice : ");
		}
		
		
	}

}
