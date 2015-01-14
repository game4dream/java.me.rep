package com.aganzo.design.danl.buz;

import org.junit.Test;

import com.aganzo.design.danl.bean.Singleton;

public class TestDL {

	@Test
	public void test() {
		Singleton instance = Singleton.instance();
		Singleton instance2 = Singleton.instance();
		if (instance == instance2) {
			System.out.println("两个引用是相同的");
		}
	}

}
