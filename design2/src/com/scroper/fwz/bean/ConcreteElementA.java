/**
 * 
 */
package com.scroper.fwz.bean;

/**
 * @author chenming
 *
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
