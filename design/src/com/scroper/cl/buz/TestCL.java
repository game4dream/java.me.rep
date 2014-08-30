package com.scroper.cl.buz;

import junit.framework.Assert;

import org.junit.Test;

public class TestCL {

	@Test
	public void testAdd() throws Exception {
		OperationContext o = new OperationContext("+");
		Assert.assertEquals(3.0, o.getResult(1, 2));
	}
	
	@Test
	public void testSub() throws Exception {
		OperationContext o = new OperationContext("-");
		Assert.assertEquals(-1.0, o.getResult(1, 2));
	}
	
	@Test
	public void testMul() throws Exception {
		OperationContext o = new OperationContext("*");
		Assert.assertEquals(2.0, o.getResult(1, 2));
	}
	
	@Test
	public void testDiv() throws Exception {
		OperationContext o = new OperationContext("/");
		Assert.assertEquals(0.5, o.getResult(1, 2));
	}

}
