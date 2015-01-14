/**
 * 
 */
package com.aganzo.design.gcz.bean;

/**
 * @author chenming
 * 具体主题
 */
public class ConcreteSubject extends Subject {

	// 主题
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
