package com.aganzo.design.yg.buz;

import org.junit.Test;

import com.aganzo.design.yg.bean.Facade;

public class TestYG {

	@Test
	public void test() {
		Facade f = new Facade();
		f.methodA();
		f.methodB();
	}

}
