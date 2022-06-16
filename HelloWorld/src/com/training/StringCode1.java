package com.training;

public class StringCode1 {

	public static void main(String[] args) {
		String s=new String("Shruti");
		System.out.println(s.length());
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		System.out.println(s.trim());
		
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(2, 4));
		
		String w=new String("SHRUTI");
		System.out.println(w.equals("shruti"));
		
		System.out.println(w.equalsIgnoreCase("shruti"));
		
		System.out.println(s.replace("i", "a"));

	}

}
