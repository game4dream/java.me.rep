/**
 * 
 */
package com.aganzo.design.mbff.bean;

/**
 * @author chenming
 * 模板方法模式中心 
 */
public abstract class AbstractClass {

	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("in super templateMethod");
	}

}
