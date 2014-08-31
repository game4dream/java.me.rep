/**
 * 
 */
package com.scroper.danl.bean;

/**
 * @author chenming
 * 
 */
public class Singleton {

	/**
	 * 内置一个本身
	 */
	private static Singleton instance;
//	饿汉单例
//	private static Singleton instance = new Singleton();

	/**
	 * 用于防止多线程时产生多个实例的锁
	 */
	private static Object syncRoot = new Object();
	
	private Singleton() {

	}

	/**
	 * 单例模式中心，懒汉单例
	 * 注：多线程序同时调用此方法，可能产生多个实例。所以需要
	 * @return
	 */
	public static Singleton instance() {
		if (instance == null) { // 双重锁定，减少锁
			synchronized (syncRoot) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
