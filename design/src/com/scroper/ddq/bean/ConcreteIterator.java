/**
 * 
 */
package com.scroper.ddq.bean;

/**
 * 具体迭代器
 * 
 * @author chenming
 */
public class ConcreteIterator extends Iterator {

	/**
	 * 迭代器所适用的集合
	 */
	private ConcreteAggregate aggregate;

	/**
	 * 当前索引
	 */
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.count()) {
			ret = aggregate.get(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.count();
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}

}
