package com.lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLambda m= s->s.length();
		System.out.println(m.test("TEST"));
		testPrint(m);
		testPrint2(s->s.length());
	}

	public static void testPrint(myLambda m) {
		System.out.println(m.test("Hellow"));
	}
	
	public static void testPrint2(myLambda m) {
		System.out.println(m.test("Helloworld"));
	}
}

interface myLambda{
	int test(String s);
	
}