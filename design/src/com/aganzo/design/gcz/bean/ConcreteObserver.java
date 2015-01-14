/**
 * 
 */
package com.aganzo.design.gcz.bean;

/**
 * @author chenming
 * 具体观察者
 */
public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject cs;

	public ConcreteObserver(ConcreteSubject cs, String name) {
		this.cs = cs;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = cs.getSubjectState();
		System.out.println("ConcreteObserver.update(), " + name + " 的新状态是：" + observerState);
	}

	public ConcreteSubject getCs() {
		return cs;
	}

	public void setCs(ConcreteSubject cs) {
		this.cs = cs;
	}

}
