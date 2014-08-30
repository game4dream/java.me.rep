package com.scroper.yx.bean;

public abstract class Prototype implements Cloneable {

	private String id;

	public Prototype(String id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}

}
