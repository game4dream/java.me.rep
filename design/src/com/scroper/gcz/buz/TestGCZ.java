package com.scroper.gcz.buz;

import org.junit.Test;

import com.scroper.gcz.bean.ConcreteObserver;
import com.scroper.gcz.bean.ConcreteSubject;

public class TestGCZ {

	@Test
	public void test() {
		// 创建一个主题
		ConcreteSubject cs = new ConcreteSubject();
		// 添加三个观察者
		cs.attach(new ConcreteObserver(cs, "x"));
		cs.attach(new ConcreteObserver(cs, "y"));
		cs.attach(new ConcreteObserver(cs, "z"));
		
		// 通知各个观察者
		cs.notifyEveryOne();
		
		// 更新主题
		cs.setSubjectState("abc");
		// 通知各个观察者
		cs.notifyEveryOne();

	}

}
