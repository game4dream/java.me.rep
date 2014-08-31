/**
 * 
 */
package com.scroper.cl.bean;

/**
 * @author chenming
 * 
 */
public class OperationContext {

	private Operation o;

	/**
	 * 策略中心点
	 * 
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
