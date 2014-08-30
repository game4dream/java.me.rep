package com.scroper.yg.bean;

/**
 * @author chenming
 * 外观模式中心
 */
public class Facade {

	SubOne s1;
	SubTwo s2;
	SubThree s3;
	SubFour s4;
	
	public Facade() {
		s1 = new SubOne();
		s2 = new SubTwo();
		s3 = new SubThree();
		s4 = new SubFour();
	}
	
	public void methodA() {
		System.out.println("Facade.methodA()");
		s1.methodOne();
		s2.methodTwo();
		s4.methodFour();
	}
	
	public void methodB() {
		System.out.println("Facade.methodB()");
		s2.methodTwo();
		s3.methodThree();
	}
	
}
