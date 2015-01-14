/**
 * 
 */
package com.aganzo.design.jsq.bean;

/**
 * @author chenming
 *
 */
public class NonterminalExpressioin extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("NonterminalExpressioin.interpret(Context context)非终端解释器");
	}

}
