package com.learning.innerclass;

public class Outer {
	
	public int num = 100;
	private String name = "Siddhartha";
	
	class Inner{
		void display() {
			System.out.println("Value of num : "+num);
			System.out.println("Value of name : "+name);
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();

	}

}
