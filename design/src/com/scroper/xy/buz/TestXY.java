package com.scroper.xy.buz;
import org.junit.Test;

import com.scroper.xy.bean.Flyweight;
import com.scroper.xy.bean.FlyweightFactory;
import com.scroper.xy.bean.UnsharedConcreteFlyweight;


public class TestXY {

	@Test
	public void test() {
		int e = 22;
		FlyweightFactory ff = new FlyweightFactory();
		
		Flyweight flyweight = ff.getFlyweight("X");
		flyweight.operation(--e);
		
		Flyweight flyweight2 = ff.getFlyweight("Y");
		flyweight2.operation(--e);
		
		Flyweight flyweight3 = ff.getFlyweight("Z");
		flyweight3.operation(--e);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--e);
		
	}

}
