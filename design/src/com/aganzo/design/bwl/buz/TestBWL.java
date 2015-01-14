package com.aganzo.design.bwl.buz;

import org.junit.Test;

import com.aganzo.design.bwl.bean.Caretaker;
import com.aganzo.design.bwl.bean.Originator;

public class TestBWL {

	@Test
	public void test() {
		// 创建 一个发起人
		Originator originator = new Originator();

		// 设置发起人状态为on
		originator.setState("On");
		// 打印发起人状态
		originator.show();

		// 新建一个看守
		Caretaker caretaker = new Caretaker();
		// 将发起人的状态当成一个囚犯，看守起来
		caretaker.setMemento(originator.createMemento());

		// 更改发起人的状态为off
		originator.setState("Off");
		// 打印现在发起人的状态
		originator.show();

		// 将看守的囚犯还给发起人
		originator.setMemento(caretaker.getMemento());
		// 打印现在发起人的状态
		originator.show();
	}

}
