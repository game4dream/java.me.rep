package com.aganzo.design.jdgc.buz;

import junit.framework.Assert;

import org.junit.Test;

import com.aganzo.design.jdgc.bean.Operation;
import com.aganzo.design.jdgc.bean.OperationFactory;

public class TestJDGC {

	@Test
	public void testAdd() throws Exception {
		Operation o = OperationFactory.instance("+");
		o.setNa(1);
		o.setNb(2);
		Assert.assertEquals(3.0, o.GetResult());
	}

	@Test
	public void testSub() throws Exception {
		Operation o = OperationFactory.instance("-");
		o.setNa(1);
		o.setNb(2);
		Assert.assertEquals(-1.0, o.GetResult());
	}

	@Test
	public void testMul() throws Exception {
		Operation o = OperationFactory.instance("*");
		o.setNa(1);
		o.setNb(2);
		Assert.assertEquals(2.0, o.GetResult());
	}

	@Test
	public void testDiv() throws Exception {
		Operation o = OperationFactory.instance("/");
		o.setNa(1);
		o.setNb(2);
		Assert.assertEquals(0.5, o.GetResult());
	}
}
