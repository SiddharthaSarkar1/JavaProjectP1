//Validation of an Email ID.
package com.learningjavafsd.validationofemailid;

import java.util.Scanner;

public class EmailValidation {
	
	public static int validateEmail(String arr[], String val) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(val)) {
				return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		String emailIdS[] = {"arjub.dey@gmail.com", "sonai.pal@gmail.com", "soma.das@gmail.com", "johor.roy@gmail.com","mampi.kar@gmail.com", "bobby.dey@gmail.com", "komola.sau@gmail.com", "biplob.dey@gmail.com", "deepak.adhikari@gmail.com", "jeet.bhai@gmail.com", "prapti.ghotok@gmail.com", "ghonta.roy@gmail.com", "kalu.saha@gmail.com", "khoka.jana@gmail.com", "sonai.khara@gmail.com", "mukta.patro@gmail.com", "gonai.ghotok@gmail.com", "bablu.kola@gmail.com", "sonta.kumar@gmail.com", "subrata.dhar@gmail.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id : ");
		String emailid = sc.next();
		sc.close();
		int res = validateEmail(emailIdS, emailid);
		
		if(res == 1) {
			System.out.println("You have entered valid email id."); 
		}else {
			System.out.println("You have entered invalid email id."); 
		}
		
	}
	
}
