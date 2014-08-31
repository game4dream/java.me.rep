/**
 * 
 */
package com.scroper.xy.bean;

/**
 * @author chenming
 *
 */
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("ConcreteFlyweight.operation(int extrinsicstate)");
	}

}
