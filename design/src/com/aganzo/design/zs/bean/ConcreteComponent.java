package com.aganzo.design.zs.bean;

/**
 * @author chenming
 * 基本具体操作实现类
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象操作");
	}

}
