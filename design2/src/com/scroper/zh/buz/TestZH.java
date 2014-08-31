package com.scroper.zh.buz;

import org.junit.Test;

import com.scroper.zh.bean.Composite;
import com.scroper.zh.bean.Leaf;

public class TestZH {

	@Test
	public void test() {
		// 根节点
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		// 分支
		Composite c1 = new Composite("Composite X");
		c1.add(new Leaf("Leaf XA"));
		c1.add(new Leaf("Leaf XB"));
		root.add(c1);
		
		// 分支
		Composite c2 = new Composite("Composite XY");
		c2.add(new Leaf("Leaf XYA"));
		c2.add(new Leaf("Leaf XYB"));
		c1.add(c2);
		
		root.add(new Leaf("Leaf C"));
		
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		root.displayer(1);
		
	}

}
