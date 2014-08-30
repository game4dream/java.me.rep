/**
 * 
 */
package com.scroper.jzz.bean;

/**
 * @author chenming
 * 建造实现类
 */
public class ConcreteBuilder1 extends Builder {

	// 建造的东西
	private Product product = new Product();

	// 建造的过程
	@Override
	public void buildPartA() {
		product.add("ConcreteBuilder1.buildPartA()");
	}

	// 建造的过程
	@Override
	public void buildPartB() {
		product.add("ConcreteBuilder1.buildPartB()");
	}

	// 取出建造的东西
	@Override
	public Product getResult() {
		return product;
	}

}
