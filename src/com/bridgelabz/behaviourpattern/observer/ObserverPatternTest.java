package com.bridgelabz.behaviourpattern.observer;

public class ObserverPatternTest {
	public static void main(String[] args) {
		Channel technoLearn = new Channel();
		
		Subscriber s1 = new Subscriber("kiran");
		Subscriber s2 = new Subscriber("Chetan");
		Subscriber s3 = new Subscriber("Mandar");
		Subscriber s4 = new Subscriber("Akshay");
		//.
		
		technoLearn.subscribe(s1);
		technoLearn.subscribe(s2);
		technoLearn.subscribe(s3);
		technoLearn.subscribe(s4);
		
		technoLearn.unSubscribe(s3);
		s1.subscribechannel(technoLearn);
		s2.subscribechannel(technoLearn);
		s3.subscribechannel(technoLearn);
		s4.subscribechannel(technoLearn);
		
		
	
		technoLearn.upload("OOPes Java");
	
	}
}
