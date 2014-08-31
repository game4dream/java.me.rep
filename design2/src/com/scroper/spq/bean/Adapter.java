/**
 * 
 */
package com.scroper.spq.bean;

/**
 * @author chenming
 * 具体适配类
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();

	
	@Override
	public void request() {
		// 适配器中心，重写request方法
		adaptee.specificRequest();
	}

}
