package com.eql;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if (one.equals(two)) {
		System.out.println("one and two are equal");
		}else {
			System.out.println("one and two are NOT equal");
		}
	}

}
