/**
 * 
 */
package com.scroper.zt.bean;

/**
 * @author chenming
 * 具体状态A
 */
public class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
		// 更改为状态B
		context.setState(new ConcreteStateB());
	}

}
