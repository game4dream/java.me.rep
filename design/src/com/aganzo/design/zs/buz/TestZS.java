package com.aganzo.design.zs.buz;

import org.junit.Test;

import com.aganzo.design.zs.bean.ConcreteComponent;
import com.aganzo.design.zs.bean.ConcreteDecoratorA;
import com.aganzo.design.zs.bean.ConcreteDecoratorB;

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
