/**
 * 
 */
package com.scroper.jdgc.bean;


/**
 * @author chenming
 *
 */
public class OperationFactory {

	/**
	 * 简单工厂中心点
	 * @param operate
	 * @return
	 */
	public static Operation instance(String operate) {
		Operation o = null;
		switch (operate) {
		case "+":
			return new OperationAdd();
		case "-":
			return new OperationSub();
		case "*":
			return new OperationMul();
		case "/":
			return new OperationDiv();
		default:
			return o;
		}
	}
	
}
