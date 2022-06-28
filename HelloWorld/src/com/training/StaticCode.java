package com.training;

public class StaticCode {
	String name;
	int roll;
	static String college="St. John College";
	
	void display() {
	
	
		System.out.println(roll+"  "+name+"  "+college);
	}
	
static void change() {
	college="Mumbai University";
}

	public StaticCode(String name, int roll) {
		super();
		
			this.roll= roll;
			this.name= name;
			
	}



	public static void main(String[] args) 
	{
	StaticCode s1= new StaticCode("Shruti",1);
	StaticCode s2= new StaticCode("hruta",2);
	s1.display();
	s2.display();
	StaticCode.change();
	s1.display();
	s2.display();
	}

}
