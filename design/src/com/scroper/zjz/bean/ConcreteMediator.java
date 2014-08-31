/**
 * 
 */
package com.scroper.zjz.bean;

/**
 * 具体中介人
 * 中介者模式中心
 * 
 * @author chenming
 * 
 */
public class ConcreteMediator extends Mediator {

	/**
	 * 此中介只联系两个同事
	 */
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == colleague1) {
			colleague2.noti(message);
		} else {
			colleague1.noti(message);
		}
	}

	public ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

}
