package com.learning.innerclass;

public class LocalInn2 {
	
	void getRes(int age) {
		if(age > 18) {
			class Validation{
				void validate() {
					System.out.println("You are eligible for vote.");
				}
			}
			
			Validation vid = new Validation();
			vid.validate();
			
		}else {
			System.out.println("You are not eligible for vote.");
		}		
	}

	public static void main(String[] args) {
		LocalInn2 lc = new LocalInn2();
		lc.getRes(20);
		lc.getRes(10);
		lc.getRes(60);

	}

}
