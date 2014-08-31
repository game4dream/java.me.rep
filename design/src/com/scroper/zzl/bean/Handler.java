/**
 * 
 */
package com.scroper.zzl.bean;

/**
 * 抽象审核人
 * 职责链中心
 * @author chenming
 */
public abstract class Handler {

	protected Handler successor;

	public abstract void handleRequest(int request);

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
