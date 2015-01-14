package com.aganzo.design.zs.bean;

/**
 * @author chenming
 * 具体装饰类
 */
public class ConcreteDecoratorA extends Decorator {

	@Override
	public void operation() {
		super.operation();
		System.out.println("A 操作");
	}
	
}
