package com.loops;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0,j = 0; (i<=10) && (j<=10); i++, j++) {
			System.out.println("i is " + i + " j is " +j);
			}
		
		int b = 3;
		for (int a = 1; b != 1; System.out.println("iterate")) {
		b = b - a;
		}
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Inside loop");
			continue;
			}
	}

}
