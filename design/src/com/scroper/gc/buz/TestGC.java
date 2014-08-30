package com.scroper.gc.buz;

import junit.framework.Assert;

import org.junit.Test;

import com.scroper.gc.bean.AddFactory;
import com.scroper.gc.bean.DivFactory;
import com.scroper.gc.bean.IFactory;
import com.scroper.gc.bean.MulFactory;
import com.scroper.gc.bean.Operation;
import com.scroper.gc.bean.SubFactory;

public class TestGC {

	@Test
	public void testAdd() throws Exception {
		IFactory af = new AddFactory();
		Operation createOperation = af.createOperation();
		createOperation.setNa(1);
		createOperation.setNb(2);
		Assert.assertEquals(3.0, createOperation.GetResult());
		
		af = new DivFactory();
		createOperation = af.createOperation();
		createOperation.setNa(1);
		createOperation.setNb(2);
		Assert.assertEquals(0.5, createOperation.GetResult());
		
		af = new MulFactory();
		createOperation = af.createOperation();
		createOperation.setNa(1);
		createOperation.setNb(2);
		Assert.assertEquals(2.0, createOperation.GetResult());
		
		af = new SubFactory();
		createOperation = af.createOperation();
		createOperation.setNa(1);
		createOperation.setNb(2);
		Assert.assertEquals(-1.0, createOperation.GetResult());
	}

}
