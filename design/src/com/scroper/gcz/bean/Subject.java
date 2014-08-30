/**
 * 
 */
package com.scroper.gcz.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenming
 *
 */
public abstract class Subject {

	private List<Observer> os = new ArrayList<Observer>();
	
	// 添加观察者
	public void attach(Observer o) {
		os.add(o);
	}
	
	// 移除观察者
	public void detach(Observer o) {
		os.remove(o);
	}
	
	// 通知观察者
	public void notifyEveryOne() {
		for (Observer o : os) {
			o.update();
		}
	}
	
}
