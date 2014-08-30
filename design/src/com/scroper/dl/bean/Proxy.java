package com.scroper.dl.bean;

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
