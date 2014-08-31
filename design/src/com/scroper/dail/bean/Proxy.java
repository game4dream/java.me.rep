package com.scroper.dail.bean;

public class Proxy extends Subject{

	private RealSubject rs;
	
	@Override
	public void request() {
		if (rs == null) {
			rs = new RealSubject();
		}
		rs.request();
	}

}
