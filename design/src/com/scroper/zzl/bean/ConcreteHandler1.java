/**
 * 
 */
package com.scroper.zzl.bean;

/**
 * 具体审核人1
 * 
 * @author chenming
 * 
 */

public class ConcreteHandler1 extends Handler {
	
	@Override
	public void handleRequest(int request) {
		System.out.println("ConcreteHandler1.handleRequest(int request)");
		if (request >= 0 && request < 10) {
			System.out.println(" 处理请求 " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}

}
