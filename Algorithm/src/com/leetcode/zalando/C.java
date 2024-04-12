package com.leetcode.zalando;

public class C extends B {

	public static void main(String[] args) {
		B b = new B();

		if (b instanceof C) {
			System.out.println("hello C");

		}

	}
}

class B extends A {

}

class A {

}
