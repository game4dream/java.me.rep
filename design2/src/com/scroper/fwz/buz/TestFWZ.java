package com.scroper.fwz.buz;

import org.junit.Test;

import com.scroper.fwz.bean.ConcreteElementA;
import com.scroper.fwz.bean.ConcreteElementB;
import com.scroper.fwz.bean.ConcreteVisitor1;
import com.scroper.fwz.bean.ConcreteVisitor2;
import com.scroper.fwz.bean.ObjectStructure;

public class TestFWZ {

	@Test
	public void test() {
		ObjectStructure os = new ObjectStructure();
		os.attach(new ConcreteElementA());
		os.attach(new ConcreteElementB());
		
		ConcreteVisitor1 cv1 = new ConcreteVisitor1();
		ConcreteVisitor2 cv2 = new ConcreteVisitor2();
		
		os.accept(cv1);
		os.accept(cv2);
	}

}
