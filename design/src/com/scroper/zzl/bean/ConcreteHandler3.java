/**
 * 
 */
package com.scroper.zzl.bean;

/**
 * 具体审核人3
 * 
 * @author chenming
 * 
 */
public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		System.out.println("ConcreteHandler3.handleRequest(int request)");
		if (request >= 20 && request < 30) {
			System.out.println(" 处理请求 " + request);
		} else if (successor != null) {
			successor.handleRequest(request);
		}
	}

}
