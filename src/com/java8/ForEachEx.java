package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list= new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add("STRING"+i);
		}
		System.out.println(list);
		List list1 = new ArrayList<>();
		
		list.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		}) ;
	}

	
}
