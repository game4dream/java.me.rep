/**
 * 
 */
package com.aganzo.design.fwz.bean;

/**
 * @author chenming
 *
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA cea) {
		System.out.println("ConcreteVisitor2.visitConcreteElementA(ConcreteElementA cea)");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB ceb) {
		System.out.println("ConcreteVisitor2.visitConcreteElementB(ConcreteElementB ceb)");
	}

}
