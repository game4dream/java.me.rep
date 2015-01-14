/**
 * 
 */
package com.aganzo.design.ddq.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 * 
 * @author chenming
 */
public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count() {
		return items.size();
	}

	public Object get(int index) {
		return items.get(index);
	}
	
	public void add(Object o) {
		items.add(o);
	}

}
