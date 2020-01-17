package com.bridgelabz.creationaldesignpattern.singleton;

public class SingleDemo {

	public static void main(String[] args) {
		EagerInitializeSingletonApp e1 = EagerInitializeSingletonApp.getInstance();
		System.out.println(e1.e);

		StaticBlockSingleton c1 = StaticBlockSingleton.getInstance();
		System.out.println(c1.s);
		
		LazyInstantiationApp l1 = LazyInstantiationApp.getInstance();
		System.out.println(l1.s);
		
		ThreadSafeInstantiation t1 = ThreadSafeInstantiation.getInstance();
		System.out.println(t1.s);
		
		BillPugInstatiation b1 = BillPugInstatiation.getinstance();
		System.out.println(b1.s);
	}

}
