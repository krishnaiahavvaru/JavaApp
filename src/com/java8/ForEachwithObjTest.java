package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachwithObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student();
		st1.setsAddr("Alpharetta");
		st1.setsName("Nikki");
		Student st2 = new Student();
		st2.setsAddr("Cumming");
		st2.setsName("Suji");
		Student st3 = new Student();
		st3.setsAddr("Dunwoody");
		st3.setsName("Mithin");
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		list.forEach(new Consumer<Student>() {
			public void accept(Student t) {
				System.out.println(t.getsAddr());
			}
		});
	}

}
