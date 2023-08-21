package com.learning.behaviouralDP.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
	private List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subscribers.remove(ob);
	}

	@Override
	public void notifyChanges(String title) {
		for( Observer ob: this.subscribers) {
			ob.notified(ob, title);
		}
	}
}
