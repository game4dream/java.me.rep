/**
 * 
 */
package com.scroper.zt.buz;

import org.junit.Test;

import com.scroper.zt.bean.ConcreteStateA;
import com.scroper.zt.bean.Context;

/**
 * @author chenming
 *
 */
public class TestZT {

	@Test
	public void test() {
		Context context = new Context(new ConcreteStateA());
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
