package com.scroper.zs.buz;

import org.junit.Test;

import com.scroper.zs.bean.ConcreteComponent;
import com.scroper.zs.bean.ConcreteDecoratorA;
import com.scroper.zs.bean.ConcreteDecoratorB;

public class TestZS {

	@Test
	public void test() {
		ConcreteComponent cC = new ConcreteComponent();
		ConcreteDecoratorA cDA = new ConcreteDecoratorA();
		ConcreteDecoratorB cDB = new ConcreteDecoratorB();
		
		cDA.setComponent(cC);
		cDB.setComponent(cDA);
		cDB.operation();
	}

}
