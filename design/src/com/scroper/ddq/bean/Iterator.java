/**
 * 
 */
package com.scroper.ddq.bean;

/**
 * @author chenming
 * 
 */
public abstract class Iterator {

	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();

}