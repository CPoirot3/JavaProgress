package com.bupt.poirot.pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

	List<Observer> observerList = new ArrayList<>();
	
	public int flag;
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
		notifyObservers();
	}
	
	
	
	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}
