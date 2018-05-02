package com.lambda;

public class HelloWorlds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lambda str = ()->System.out.println("TEST");
		str.foo();
	}
		
		

}

interface lambda{
	void foo();
}
