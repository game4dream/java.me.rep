/**
 * 
 */
package com.aganzo.design.csgc.bean;

/**
 * @author chenming
 *
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("AccessDepartment.insert(Department department)");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("AccessDepartment.getDepartment(int id)");
		return null;
	}

}
