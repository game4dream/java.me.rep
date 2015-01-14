package com.aganzo.design.mbff.buz;

import org.junit.Test;

import com.aganzo.design.mbff.bean.AbstractClass;
import com.aganzo.design.mbff.bean.ConcreteClassA;
import com.aganzo.design.mbff.bean.ConcreteClassB;

public class TestMBFF {

	@Test
	public void test() {
		
		AbstractClass ac;
		
		ac = new ConcreteClassA();
		ac.templateMethod();
		
		ac = new ConcreteClassB();
		ac.templateMethod();
		
	}

}
