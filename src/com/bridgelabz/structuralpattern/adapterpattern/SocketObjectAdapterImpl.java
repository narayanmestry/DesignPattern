package com.bridgelabz.structuralpattern.adapterpattern;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get30Volt() {
		Volt v = socket.getVolt();
		return voltConvertor(v,4);
	}


	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return voltConvertor(v, 10);
	}
	
	private Volt voltConvertor(Volt v, int i) {
		 return new Volt(v.getVolt()/i);
	}
}
