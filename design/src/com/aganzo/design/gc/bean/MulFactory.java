package com.aganzo.design.gc.bean;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
