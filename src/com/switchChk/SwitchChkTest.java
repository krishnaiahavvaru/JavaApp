package com.switchChk;

public class SwitchChkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		switch (x) {
		case 1:
		System.out.println("x is equal to 1");
		break;
		case 2:
		System.out.println("x is equal to 2");
		break;
		case 3:
		System.out.println("x is equal to 3");
		break;
		default:
		System.out.println("Still no idea what x is");
		}
		String y = "30";
		switch (y) {
		case "1":
		System.out.println("x is equal to 1");
		break;
		case "2":
		System.out.println("x is equal to 2");
		
		default:
			System.out.println("Still no idea what x is");
		case "4":
		case "3":
		System.out.println("x is equal to 3");
		
		}
		
		
	}

}
