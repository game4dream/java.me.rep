package com.aganzo.design.spq.buz;

import org.junit.Test;

import com.aganzo.design.spq.bean.Adapter;
import com.aganzo.design.spq.bean.Target;

public class TestSPQ {

	@Test
	public void test() {
		// 声明 一个适配器
		Target t = new Adapter();
		// 处理事件
		t.request();
	}

}
