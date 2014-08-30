/**
 * 
 */
package com.scroper.csgc.bean;

/**
 * @author chenming
 *
 */
public class SqlserverUser implements IUser {

	@Override
	public void insert(User User) {
		System.out.println("SqlserverUser.insert(User User)");
	}

	@Override
	public User getUser(int id) {
		System.out.println("SqlserverUser.getUser(int id)");
		return null;
	}

}
