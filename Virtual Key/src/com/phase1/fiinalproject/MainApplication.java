package com.phase1.fiinalproject;

import java.io.IOException;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		int oprOne, oprBusiness;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**************************************************************************************\n");
		System.out.println("\tWelcome to LockedMe.com application developed by Siddhartha Sarkar.\n");
		System.out.println("**************************************************************************************");
		while(true) {
			System.out.println("Plese enter one of the following option : ");
			System.out.println("----------------------------------------------");
			System.out.println("1. To get the file list from the directory.");
			System.out.println("2. To perform business operations.");
			System.out.println("3. To close the application.");
			System.out.println("----------------------------------------------");
			oprOne = sc.nextInt();
			
			Operations oprObj = new Operations();
			
			switch(oprOne) {
				case 1 :
					System.out.println("List of the files are : "); 
					oprObj.getFileList();
					System.out.println("===========================================================");
					break;
				case 2 : 
					System.out.println("Please enter any of the following to perform business operations : ");
					System.out.println("--------------------------------------------------------------------");
					System.out.println("1. To create a file");
					System.out.println("2. To search a file");
					System.out.println("3. To delete a file");
					System.out.println("4. Go back to the previous menu.");
					System.out.println("--------------------------------------------------------------------");
					oprBusiness = sc.nextInt();
					switch(oprBusiness) {
					
					case 1 : 
						System.out.println("Enter the filename you want to create : ");
						String fileName = sc.next();
						try {
							oprObj.createFile(fileName);
							System.out.println("press 1 to add content in your file "+fileName+".txt otherwise press 2");
							int inp = sc.nextInt();
							if(inp == 1) {
								sc.nextLine();//To skip the newline character because taking String input after int
								System.out.println("Enter the content : ");
								String fileContent = sc.nextLine();
								oprObj.writeinFile(fileName, fileContent);
							}else {
								break;
							}
						}catch(IOException ioe) {
							System.out.println(ioe);
						}
						break;
					case 2 : 
						System.out.println("Enter the filename you want to search : ");
						String fSearch = sc.next();
						int res = oprObj.fileIsExist(fSearch);
						if(res == 1) {
							System.out.println("File "+fSearch+".txt is exist in this directory.");
						}else {
							System.out.println("File "+fSearch+".txt does not exist in this directory.");
						}
						System.out.println("================================================");
						break;
					case 3 : 
						System.out.println("Enter the filename you want to delete : ");
						String dFile = sc.next();
						try {
							oprObj.deleteFile(dFile);	
						}catch(IOException ioe) {
							System.out.println(ioe);
						}
						System.out.println("================================================");
						break;
						
					case 4 : 
						
						break;
					default : 
						System.out.println("You have entered a wrong input");
					}
					break;
					
				case 3 :
					System.out.println("Closing the application........");
					System.out.println("Thanks for using LockedMe.com.");
					System.out.println("===========================================================");
					return;
				default:
					System.out.println("You have entered invalid input.");
			}
		}
	}

}
