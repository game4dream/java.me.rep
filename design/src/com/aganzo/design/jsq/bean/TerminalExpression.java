/**
 * 
 */
package com.aganzo.design.jsq.bean;

/**
 * @author chenming
 *
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("TerminalExpression.interpret(Context context) 终端解释器");
	}

}
