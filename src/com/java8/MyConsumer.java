package com.java8;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

	public void accept(Student t) {
		System.out.println(t.getsName());
	}
}
