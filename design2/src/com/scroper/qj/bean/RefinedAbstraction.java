/**
 * 
 */
package com.scroper.qj.bean;

/**
 * @author chenming
 * 桥接模式中心
 */
public class RefinedAbstraction extends Abstraction {

	@Override
	public void operation() {
		System.out.println("RefinedAbstraction.operation()");
		i.operation();
	}
	
}
