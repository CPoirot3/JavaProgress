package com.bupt.poirot.pattern.observerPattern;

public interface ISubject {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
}
