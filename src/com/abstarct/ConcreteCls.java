package com.abstarct;

public class ConcreteCls extends AbstractCls {

	
	
	 ConcreteCls(int j){
		super(10);
		System.out.println("ConcreteCls"+j);
	}
	public String test() {
	
		System.out.println("ConcreteClsTestMethod");
		
		return "TEST";
	}
	
}
