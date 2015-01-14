/**
 * 
 */
package com.aganzo.design.jdgc.bean;

/**
 * @author chenming
 * 乘法
 */
public class OperationMul extends Operation {

	@Override
	public double GetResult() {
		double result = 0;
		result = getNa() * getNb();
		return result;
	}
	
}
