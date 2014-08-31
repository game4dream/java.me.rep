package com.scroper.jsq.buz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.scroper.jsq.bean.AbstractExpression;
import com.scroper.jsq.bean.Context;
import com.scroper.jsq.bean.NonterminalExpressioin;
import com.scroper.jsq.bean.TerminalExpression;

public class TestJSQ {

	@Test
	public void test() {
		// 定义有输入输出的上下文
		Context c = new Context();
		// 创建各种解释器
		List<AbstractExpression> l = new ArrayList<AbstractExpression>();
		l.add(new TerminalExpression());
		l.add(new NonterminalExpressioin());
		l.add(new TerminalExpression());
		l.add(new TerminalExpression());
		l.add(new TerminalExpression());
		
		for (AbstractExpression ae : l) {
			// 逐一解释，并以上一解释器的上下文做为下一解释器的上下文
			ae.interpret(c);
		}
		
	}

}
