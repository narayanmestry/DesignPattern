package com.bridgelabz.behaviourpattern.mediator;

public class UserImpl extends User {

	
	
	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
		
	}

	@Override
	public void send(String msg) {
			System.out.println(this.name+": Sending Messsage : "+msg);
			mediator.sendMessage(msg, this);
		
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Recieved Message "+msg);
	}

}
