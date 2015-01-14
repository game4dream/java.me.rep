package com.aganzo.design.qj.buz;

import org.junit.Test;

import com.aganzo.design.qj.bean.Abstraction;
import com.aganzo.design.qj.bean.ConcreteImplementorA;
import com.aganzo.design.qj.bean.ConcreteImplementorB;
import com.aganzo.design.qj.bean.RefinedAbstraction;

public class TestQJ {

	@Test
	public void test() {
		Abstraction a = new RefinedAbstraction();
		a.setI(new ConcreteImplementorA());
		a.operation();
		
		a.setI(new ConcreteImplementorB());
		a.operation();
		
	}

}
