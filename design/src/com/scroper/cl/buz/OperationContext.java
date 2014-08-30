/**
 * 
 */
package com.scroper.cl.buz;

import com.scroper.jdgc.bean.Operation;
import com.scroper.jdgc.bean.OperationAdd;
import com.scroper.jdgc.bean.OperationDiv;
import com.scroper.jdgc.bean.OperationMul;
import com.scroper.jdgc.bean.OperationSub;

/**
 * @author chenming
 * 
 */
public class OperationContext {

	private Operation o;

	/**
	 * 策略中心点
	 * @param operate
	 */
	public OperationContext(String operate) {
		switch (operate) {
		case "+":
			o = new OperationAdd();
			break;
		case "-":
			o = new OperationSub();
			break;
		case "*":
			o = new OperationMul();
			break;
		case "/":
			o = new OperationDiv();
			break;
		default:
			o = null;
			break;
		}
	}

	public double getResult(double na, double nb) throws Exception {
		o.setNa(na);
		o.setNb(nb);
		return o.GetResult();
	}

}
