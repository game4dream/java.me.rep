package com.scroper.jzz.buz;

import org.junit.Test;

import com.scroper.jzz.bean.ConcreteBuilder1;
import com.scroper.jzz.bean.ConcreteBuilder2;
import com.scroper.jzz.bean.Director;
import com.scroper.jzz.bean.Product;

public class TestJZZ {

	@Test
	public void test() {
		// 来个导演
		Director d = new Director();
		//  剧本一
		ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
		//  剧本二
		ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
		
		//  按剧本一导一部戏
		d.construct(concreteBuilder1);
		//  杀青，后期
		Product result = concreteBuilder1.getResult();
		//  上映
		result.show();
		
		// 按剧本二导一部戏
		d.construct(concreteBuilder2);
		// 杀青，后期
		Product result2 = concreteBuilder2.getResult();
		// 上映
		result2.show();
	}

}
