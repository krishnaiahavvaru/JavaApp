package com.poly;

import java.io.IOException;

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Animal {
public void eat() throws Exception {
// throws an Exception
	
}
}

class Dog2 extends Animal {
public void eat() { /* no Exceptions */}
public static void main(String [] args) throws IOException {
Animal a = new Dog2();
Dog2 d = new Dog2();
d.eat(); // ok
//a.eat(); // compiler error -
// unreported exception
}
}