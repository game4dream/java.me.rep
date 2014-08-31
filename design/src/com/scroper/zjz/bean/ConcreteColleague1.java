/**
 * 
 */
package com.scroper.zjz.bean;

/**
 * @author chenming
 * 
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void noti(String message) {
		System.out.println("ConcreteColleague1.noti(String message) " + message);
	}
	
}
