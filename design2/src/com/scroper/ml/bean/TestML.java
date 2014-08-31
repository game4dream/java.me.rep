package com.scroper.ml.bean;

import org.junit.Test;

public class TestML {

	@Test
	public void test() {
		
		// 创建一个命令执行者
		Receiver receiver = new Receiver();
		// 创建一个具体命令，指定命令执行人
		ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
		// 创建一个命令下达者
		Invoker invoker = new Invoker();

		// 下达命令
		invoker.setCommand(concreteCommand);
		// 执行命令
		invoker.executeCommand();

	}

}
