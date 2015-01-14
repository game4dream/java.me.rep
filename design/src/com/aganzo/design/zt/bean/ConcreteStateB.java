/**
 * 
 */
package com.aganzo.design.zt.bean;

/**
 * @author chenming
 *
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		// 更改为状态A
		context.setState(new ConcreteStateA());
	}

}
