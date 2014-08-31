/**
 * 
 */
package com.scroper.bwl.bean;

/**
 * @author chenming
 * 发起人
 */
public class Originator {

	
	/**
	 * 发起人状态
	 */
	private String state;

	/**
	 * 创建备忘录，将当前需要保存的信息导入并实例化出一个备忘对象
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 恢复备忘录，将Memento导入并将相关数据恢复
	 * 
	 * @param memento
	 */
	public void setMemento(Memento memento) {
		state = memento.getState();
	}

	public void show() {
		System.out.println("Originator.show() state=" + state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
