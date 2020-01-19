package com.bridgelabz.structuralpattern.adapterpattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		classAdapterTest();
		ObjectAdapterTest();
		
	}

	private static void ObjectAdapterTest() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v12 = socketAdapter.get12Volt();
		Volt v30 = socketAdapter.get30Volt();
		Volt v120 = socketAdapter.get120Volt();
		System.out.println("Object Adapter "+v12.getVolt());
		System.out.println("Object Adapter "+v30.getVolt());
		System.out.println("Object Adapter "+v120.getVolt());
		
	}

	private static void classAdapterTest() {
		SocketAdapter socketAdapter = new SocketclassAdapterImpl();
		Volt v12 = getVolt(socketAdapter,12);
		Volt v30 = getVolt(socketAdapter, 30);
		Volt v120 = getVolt(socketAdapter, 120);
		
		System.out.println("Class Adapter : "+v12.getVolt());
		System.out.println("Class Adapter : "+v30.getVolt());
		System.out.println("Class Adapter : "+v120.getVolt());
		
	}

	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		// TODO Auto-generated method stub
		switch(i)
		{
		case 12 : return socketAdapter.get12Volt();
		case 30 : return socketAdapter.get30Volt();
		case 120 : return socketAdapter.get120Volt();
		default : return socketAdapter.get120Volt();
		}
	}

}
