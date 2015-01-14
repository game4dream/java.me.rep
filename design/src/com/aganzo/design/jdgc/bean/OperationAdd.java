/**
 * 
 */
package com.aganzo.design.jdgc.bean;

/**
 * @author chenming
 * 加法
 */
public class OperationAdd extends Operation {

	@Override
	public double GetResult() {
		double result = 0;
		result = getNa() + getNb();
		return result;
	}
	
}
