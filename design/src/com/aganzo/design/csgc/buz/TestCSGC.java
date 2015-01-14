package com.aganzo.design.csgc.buz;

import org.junit.Test;

import com.aganzo.design.csgc.bean.AccessFactory;
import com.aganzo.design.csgc.bean.Department;
import com.aganzo.design.csgc.bean.IDepartment;
import com.aganzo.design.csgc.bean.IFactory;
import com.aganzo.design.csgc.bean.IUser;
import com.aganzo.design.csgc.bean.User;

public class TestCSGC {

	@Test
	public void test() {
		User user = new User();
		Department department = new Department();

		// 选择数据源
		// IFactory ifactory = new SqlserverFactory();
		IFactory ifactory = new AccessFactory();

		IUser iu = ifactory.createUser();
		iu.insert(user);
		iu.getUser(1);

		IDepartment id = ifactory.createDepartment();
		id.insert(department);
		id.getDepartment(1);

	}

}
