/**
 * 
 */
package com.aganzo.design.cl.bean;

/**
 * @author chenming
 * 减法
 */
public class OperationDiv extends Operation {

	@Override
	public double GetResult() throws Exception {
		double result = 0;
		if (getNb() == 0) {
			throw new Exception("分母为0");
		} else {
			result = getNa() / getNb();
			return result;
		}
		
	}
	
}
