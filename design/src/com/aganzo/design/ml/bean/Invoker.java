/**
 * 
 */
package com.aganzo.design.ml.bean;

/**
 * @author chenming
 * 命令下达者
 */
public class Invoker {

	private Command command;

	/**
	 * 执行命令
	 */
	public void executeCommand() {
		command.execute();
	}

	/**
	 * 下达命令
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

}
