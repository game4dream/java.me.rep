/**
 * 
 */
package com.aganzo.design.csgc.bean;

/**
 * @author chenming
 *
 */
public class AccessUser implements IUser {

	@Override
	public void insert(User User) {
		System.out.println("AccessUser.insert(User User)");
	}

	@Override
	public User getUser(int id) {
		System.out.println("AccessUser.getUser(int id)");
		return null;
	}

}
