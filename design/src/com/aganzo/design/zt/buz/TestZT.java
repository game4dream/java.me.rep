/**
 * 
 */
package com.aganzo.design.zt.buz;

import org.junit.Test;

import com.aganzo.design.zt.bean.ConcreteStateA;
import com.aganzo.design.zt.bean.Context;

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
