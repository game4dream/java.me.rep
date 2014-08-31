/**
 * 
 */
package com.scroper.xy.bean;

/**
 * @author chenming
 *
 */
public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("UnsharedConcreteFlyweight.operation(int extrinsicstate)");
	}

}
