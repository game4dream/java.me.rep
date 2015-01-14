/**
 * 
 */
package com.aganzo.design.csgc.bean;

/**
 * @author chenming
 *
 */
public interface IFactory {

	IUser createUser();
	
	IDepartment createDepartment();
	
}
