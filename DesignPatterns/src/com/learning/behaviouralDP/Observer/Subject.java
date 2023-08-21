package com.learning.behaviouralDP.Observer;



public interface Subject {
	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	
	void notifyChanges(String title);
}
