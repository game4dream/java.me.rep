/**
 * 
 */
package com.scroper.csgc.bean;

/**
 * @author chenming
 * 
 */
public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("SqlserverDepartment.insert(Department department)");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlserverDepartment.getDepartment(int id)");
		return null;
	}

}
