package com.scroper.zjz.buz;

import org.junit.Test;

import com.scroper.zjz.bean.ConcreteColleague1;
import com.scroper.zjz.bean.ConcreteColleague2;
import com.scroper.zjz.bean.ConcreteMediator;

public class TestZJZ {

	@Test
	public void test() {
		// 建个中介人
		ConcreteMediator m = new ConcreteMediator();
		// 来个同事1
		ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(m);
		// 再来个同事2
		ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(m);
		// 同事与中介人设置联系
		m.setColleague1(concreteColleague1);
		m.setColleague2(concreteColleague2);
		
		concreteColleague1.send("吃过饭了吗？");
		concreteColleague2.send("没有。");
	}

}
