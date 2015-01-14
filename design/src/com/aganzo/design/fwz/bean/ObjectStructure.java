/**
 * 
 */
package com.aganzo.design.fwz.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenming
 *
 */
public class ObjectStructure {

	private List<Element> es = new ArrayList<Element>();
	
	public void attach(Element e) {
		es.add(e);
	}
	
	public void detach(Element e) {
		es.remove(e);
	}
	
	public void accept(Visitor v) {
		for (Element e : es) {
			e.accept(v);
		}
	}
}
