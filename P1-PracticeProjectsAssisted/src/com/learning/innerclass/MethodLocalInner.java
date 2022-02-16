package com.learning.innerclass;

public class MethodLocalInner {
	
	public void display() {
		//This is Method local inner class
		class Inner{
			int val = 200;
			
			void show() {
				System.out.println("Value of val is : "+val);
			}
		}
		Inner in = new Inner();
		in.show();
	}

	public static void main(String[] args) {
		MethodLocalInner mlin = new MethodLocalInner();
		mlin.display();

	}

}
