/**
 * 
 */
package com.scroper.fwz.bean;

/**
 * @author chenming
 *
 */
public class ConcreteVisitor1 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA cea) {
		System.out.println("ConcreteVisitor1.visitConcreteElementA(ConcreteElementA cea)");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB ceb) {
		System.out.println("ConcreteVisitor1.visitConcreteElementB(ConcreteElementB ceb)");
	}

}
