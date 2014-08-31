/**
 * 
 */
package com.scroper.ml.bean;

/**
 * @author chenming
 * 具体命令
 */
public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver r) {
		super(r);
	}

	@Override
	public void execute() {
		r.action();
	}

}
