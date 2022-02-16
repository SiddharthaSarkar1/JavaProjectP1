//File Handling.
package com.learningjavafsd.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	//Method to create file
		public static void createFile() throws IOException {
			
			File file = new File("C:\\Users\\SID\\git\\FilesSidFHJava\\newfileSid.txt");
			if(file.createNewFile()) {
				System.out.println("File is successfully created.");
			}else {
				System.out.println("Sorry!!!! File is not created.");
			}
		}
		
		//Method to write file
		public static void writeFile() throws IOException {
			
			File file = new File("C:\\Users\\SID\\git\\FilesSidFHJava\\newfileSid.txt");
			FileWriter fw = new FileWriter(file, false);
			fw.write(" I am Siddhartha Sarkar.");
			fw.close();
		}
		
		//Method to read file
		public static void readFile() throws IOException {
			FileReader fr = new FileReader("C:\\Users\\SID\\git\\FilesSidFHJava\\newfileSid.txt");
			int readData;
			
			while((readData = fr.read()) != -1) {
				System.out.print((char)readData);
			}
			fr.close();
			
		}
		
		//Method to append file
		public static void appendFile() throws IOException {
			
			File file = new File("C:\\Users\\SID\\git\\FilesSidFHJava\\newfileSid.txt");
			FileWriter fw = new FileWriter(file, true);
			fw.write(" I am learning Java full stack development.");
			fw.close();
		}
		
		
		public static void main(String[] args) {
			
			try {
				//Creating file
				createFile();
				
				//Writing in the file
				writeFile();
				
				//Reading the file
				readFile();
				
				//Appended the file
				appendFile();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}

		}

	
}
