/**
 * 
 */
package com.aganzo.design.zjz.bean;

/**
 * @author chenming
 *
 */
public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
