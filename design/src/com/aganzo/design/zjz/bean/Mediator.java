/**
 * 
 */
package com.aganzo.design.zjz.bean;

/**
 * @author chenming
 *
 */
public abstract class Mediator {

	public abstract void send(String message, Colleague colleague);
	
}
