package com.training;

public class MethodOverloading {

	public static void main(String[] args) {
		Test t=new Test();
		t.m(45.2);
		t.m();
		t.m(56);
		t.m('a');

	}

}
class Test{
	public void m(){
		System.out.println("No Argument");
	}
	
	public void m(int i){
		System.out.println("Integer Argument");
	}
	
	public void m(double d){
		System.out.println("Double Argument");
	}
	
	
}