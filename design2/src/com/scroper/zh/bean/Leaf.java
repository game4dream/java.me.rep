/**
 * 
 */
package com.scroper.zh.bean;

/**
 * @author chenming
 *
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Leaf.add(Component c)");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Leaf.remove(Component c)");
	}

	@Override
	public void displayer(int depth) {
		System.out.println("Leaf.displayer(int depth)");
	}

}
