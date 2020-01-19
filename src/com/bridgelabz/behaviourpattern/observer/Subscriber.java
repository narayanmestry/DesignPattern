package com.bridgelabz.behaviourpattern.observer;

public class Subscriber implements Observer {
	private String name;
	private Channel channel = new Channel(); 

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void subscribechannel(Channel ch) {
		channel = ch;
	}

	@Override
	public void update() {
		System.out.println("Hi ....."+name+" Vedio Uploaded ....."+channel.title);

	}
}
