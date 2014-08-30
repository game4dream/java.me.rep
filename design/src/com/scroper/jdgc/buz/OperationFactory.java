/**
 * 
 */
package com.scroper.jdgc.buz;

import com.scroper.jdgc.bean.Operation;
import com.scroper.jdgc.bean.OperationAdd;
import com.scroper.jdgc.bean.OperationDiv;
import com.scroper.jdgc.bean.OperationMul;
import com.scroper.jdgc.bean.OperationSub;

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
