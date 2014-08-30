/**
 * 
 */
package com.scroper.jzz.bean;

/**
 * @author chenming
 * 建造者模式中心
 */
public abstract class Builder {

	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
	
}
