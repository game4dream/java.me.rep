/**
 * 
 */
package com.aganzo.design.ml.bean;

/**
 * @author chenming
 * 抽象命令
 */
public abstract class Command {
	
	/**
	 * 命令接收执行者
	 */
	protected Receiver r;
	
	public Command(Receiver r) {
		this.r = r;
	}
	
	public abstract void execute();
	
}
