/**
 * 
 */
package com.scroper.qj.bean;

/**
 * @author chenming
 * 
 */
public class Abstraction {

	protected Implementor i;

	public void operation() {
		i.operation();
	}

	public void setI(Implementor i) {
		this.i = i;
	}

}
