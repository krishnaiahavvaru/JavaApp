package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> map = new Hashtable<>();
		map.put("1", "one");
		//map.put("2",null);
		//map.put(null, "2");
		System.out.println(map);
		
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("1", "one");
		map1.put("2","5555");
		map1.put("2", "66666");
		System.out.println(map1);
		
		Set<String> set = new HashSet<>();
		set.add("one");
	}

}
