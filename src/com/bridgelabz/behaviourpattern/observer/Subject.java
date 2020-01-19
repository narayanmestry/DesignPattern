package com.bridgelabz.behaviourpattern.observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifyToAll();

	void upload(String title);

}