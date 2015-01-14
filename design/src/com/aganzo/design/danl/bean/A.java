/**
 * 
 */
package com.aganzo.design.danl.bean;

import java.util.UUID;

/**
 * @author chenming
 * 
 */
public class A {

	public String name = "default";

	// 静态属性，在加载类时，就已实例化。仅实例化一次。所有的A类实例共用一个静态属性
	public static A a = new A(UUID.randomUUID().toString());
	
	public A(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A a = new A("new");
		System.out.println(a.name);
		System.out.println(a.a.name);
		System.out.println(a.a.a.name);
	}
	
}
