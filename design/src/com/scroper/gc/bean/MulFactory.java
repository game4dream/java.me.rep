package com.scroper.gc.bean;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
