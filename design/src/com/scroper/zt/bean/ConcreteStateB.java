/**
 * 
 */
package com.scroper.zt.bean;

/**
 * @author chenming
 *
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
