package com.scroper.jzz.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenming
 * 建造的东西
 */
public class Product {

	List<String> parts = new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("Product.show()");
		for (String part : parts) {
			System.out.println(part);
		}
	}
	
}
