package com.training;

public class AbstractCode {

	public static void main(String[] args) {
		Scooty jupiter=new Scooty();
		jupiter.noofwheels();

	}

}

abstract class Vehicle{
	 abstract public void noofwheels();
}

class Scooty extends Vehicle{

	@Override
	public void noofwheels() {
		System.out.println("No. of Wheels in Scooty = "+ 2);
		
	}
	
	
}