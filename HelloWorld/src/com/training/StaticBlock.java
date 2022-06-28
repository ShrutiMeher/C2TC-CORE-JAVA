package com.training;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Executing main block");
		m();

	}
	static 
	{
		System.out.println("Vande mataram");
		m();
	}
	
	static 
	{
		System.out.println("I love India");
	}
	
	static 
	{
		System.out.println("JAi Hind");
	}
	
	static void m()
	{
		System.out.println("Bharat");
	}
}
