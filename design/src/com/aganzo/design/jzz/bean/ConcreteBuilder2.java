/**
 * 
 */
package com.aganzo.design.jzz.bean;

/**
 * @author chenming
 * 
 */
public class ConcreteBuilder2 extends Builder {

	//  建造的东西
	private Product product = new Product();

	// 建造的过程
	@Override
	public void buildPartA() {
		product.add("ConcreteBuilder2.buildPartA()");
	}

	// 建造的过程
	@Override
	public void buildPartB() {
		product.add("ConcreteBuilder2.buildPartA()");
	}

	// 获取建造的东西
	@Override
	public Product getResult() {
		return product;
	}

}
