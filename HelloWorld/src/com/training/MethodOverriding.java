package com.training;

public class MethodOverriding {

	public static void main(String[] args) {
		

	}

}

class Parent {
	 void property() {
		System.out.println("House, Money");
	}
	
	void marry() {
		System.out.println("Ira");
	}
			
}

class Child extends Parent{
	void marry() {
		System.out.println("Reva");
	}
}