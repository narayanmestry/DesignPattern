package com.bridgelabz.behaviourpattern.mediator;

public class MediatorPatternTest {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Chetan");
		User user2 = new UserImpl(mediator, "Kiran");
		User user3 = new UserImpl(mediator, "Raju");
		User user4 = new UserImpl(mediator, "Gaja");
		User user5 = new UserImpl(mediator, "Vishu");
		
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);

		user1.send("Hi....Raju");
		
	}

}
