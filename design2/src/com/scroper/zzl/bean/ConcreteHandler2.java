/**
 * 
 */
package com.scroper.zzl.bean;

/**
 * 具体审核人2
 * 
 * @author chenming
 * 
 */
public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(int request) {
		System.out.println("ConcreteHandler2.handleRequest(int request)");
		if (request >= 10 && request < 20) {
			System.out.println(" 处理请求 " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}

}
