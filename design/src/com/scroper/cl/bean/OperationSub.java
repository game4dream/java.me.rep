/**
 * 
 */
package com.scroper.cl.bean;

/**
 * @author chenming
 * 除法
 */
public class OperationSub extends Operation {

	@Override
	public double GetResult() {
		double result = 0;
		result = getNa() - getNb();
		return result;
	}
	
}
