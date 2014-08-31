/**
 * 
 */
package com.scroper.cl.bean;

/**
 * @author chenming
 * 
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
