package com.bridgelabz.structuralpattern.adapterpattern;
// Adapter Pattern Using class Adapter :
public class SocketclassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return voltConvertor(v,10);
	}		

	@Override
	public Volt get30Volt() {
		Volt v = getVolt();
		return voltConvertor(v, 4);
	}

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	private Volt voltConvertor(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolt()/i);
	}

	
}
