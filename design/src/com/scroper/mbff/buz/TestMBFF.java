package com.scroper.mbff.buz;

import org.junit.Test;

import com.scroper.mbff.bean.AbstractClass;
import com.scroper.mbff.bean.ConcreteClassA;
import com.scroper.mbff.bean.ConcreteClassB;

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
