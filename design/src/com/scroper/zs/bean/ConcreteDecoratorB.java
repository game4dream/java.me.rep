package com.scroper.zs.bean;

/**
 * @author chenming
 * 具体装饰类
 */
public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		System.out.println("B 操作");
	}
	
}
