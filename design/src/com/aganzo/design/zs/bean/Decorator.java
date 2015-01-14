/**
 * 
 */
package com.aganzo.design.zs.bean;

/**
 * @author chenming
 * 装饰类父类
 * 装饰模式中心
 */
public class Decorator extends Component {

	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}

}
