package com.bridgelabz.behaviourpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> list = new ArrayList<>();
	public String title ;
	
	@Override
	public void subscribe(Subscriber sub)
	{
		list.add(sub);
	}
	
	@Override
	public void unSubscribe(Observer sub)
	{
		list.remove(sub);
	}
	
	@Override
	public void notifyToAll()
	{
		for(Observer s : list)
		{
			s.update();
		}
	}

	@Override
	public void upload(String title)
	{
		this.title = title;
		notifyToAll();
	}
	
}
