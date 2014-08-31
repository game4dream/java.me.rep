package com.scroper.ddq.buz;

import org.junit.Test;

import com.scroper.ddq.bean.ConcreteAggregate;
import com.scroper.ddq.bean.ConcreteIterator;
import com.scroper.ddq.bean.Iterator;

public class TestDDQ {

	@Test
	public void test() {
		// 创建一个集合
		ConcreteAggregate ca = new ConcreteAggregate();
		// 填充数据
		ca.add("A");
		ca.add("B");
		ca.add("C");
		ca.add("D");
		ca.add("E");
		ca.add("F");
		
		// 创建该集合的迭代器
		Iterator i = new ConcreteIterator(ca);
		// 循环迭代器
		while (!i.isDone()) {
			System.out.println(i.currentItem());
			i.next();
		}
	}

}
