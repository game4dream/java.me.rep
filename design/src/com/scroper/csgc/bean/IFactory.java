/**
 * 
 */
package com.scroper.csgc.bean;

/**
 * @author chenming
 *
 */
public interface IFactory {

	IUser createUser();
	
	IDepartment createDepartment();
	
}
