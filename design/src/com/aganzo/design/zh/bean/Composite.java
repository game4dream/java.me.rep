/**
 * 
 */
package com.aganzo.design.zh.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenming
 *
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void displayer(int depth) {
		System.out.println("- " + depth + " " + name);
		for (Component c : children) {
			c.displayer(depth + 2);
		}
	}

}
