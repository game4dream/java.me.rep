/**
 * 
 */
package com.scroper.fwz.bean;

/**
 * @author chenming
 *
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);
	
}
