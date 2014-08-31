/**
 * 
 */
package com.scroper.zjz.bean;

/**
 * @author chenming
 * 
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);

	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public void noti(String message) {
		System.out.println("ConcreteColleague2.noti(String message) " + message);
	}

}
