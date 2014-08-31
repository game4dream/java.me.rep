package com.scroper.qj.buz;

import org.junit.Test;

import com.scroper.qj.bean.Abstraction;
import com.scroper.qj.bean.ConcreteImplementorA;
import com.scroper.qj.bean.ConcreteImplementorB;
import com.scroper.qj.bean.RefinedAbstraction;

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
