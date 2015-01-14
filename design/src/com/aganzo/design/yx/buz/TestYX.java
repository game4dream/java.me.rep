package com.aganzo.design.yx.buz;

import org.junit.Test;

import com.aganzo.design.yx.bean.Prototype;

public class TestYX {

	@Test
	public void test() throws CloneNotSupportedException {
		Prototype cp = new Prototype("A") {
			
		};
		Prototype clone = cp.clone();
		cp.setId("B");
		System.out.println(clone.getId());
		System.out.println(cp.getId());
	}

}
