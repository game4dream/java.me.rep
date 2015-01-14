package com.aganzo.design.zzl.buz;

import org.junit.Test;

import com.aganzo.design.zzl.bean.ConcreteHandler1;
import com.aganzo.design.zzl.bean.ConcreteHandler2;
import com.aganzo.design.zzl.bean.ConcreteHandler3;
import com.aganzo.design.zzl.bean.Handler;

public class TestZZL {

	@Test
	public void test() {
		
		// 审核人1
		Handler h1 = new ConcreteHandler1();
		// 审核人2
		Handler h2 = new ConcreteHandler2();
		// 审核3
		Handler h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		int[] requests = { 2, 3, 14, 22, 18, 3, 27, 20 };
		for (int i : requests) {
			h1.handleRequest(i);
		}
	}

}
