/**
 * 
 */
package com.aganzo.design.fwz.bean;

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
