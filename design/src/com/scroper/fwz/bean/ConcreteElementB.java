/**
 * 
 */
package com.scroper.fwz.bean;

/**
 * @author chenming
 *
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
