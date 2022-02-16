package com.phase1.fiinalproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Operations {
	//Path of the directory
	final static String FOLDER_PATH = "C:\\Users\\SID\\git\\FilesSidFHJava";
	//Method to display all the files
	public void getFileList() {
		File file = new File(FOLDER_PATH);
		
		List<String> fileList = new ArrayList<>();
		fileList = Arrays.asList(file.list());
		Collections.sort(fileList);
		for(String ele : fileList) {
			System.out.println(ele);
		}
	}
	
	public int fileIsExist(String fName) {
		File file = new File(FOLDER_PATH);
		List<String> filelist = new ArrayList<>();
		filelist = Arrays.asList(file.list());
		
		if(filelist.contains(fName+".txt")) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	public void createFile(String fname) throws IOException
	{
		if(fileIsExist(fname) == 1) {
			System.out.println("File is already exist, you cannot create a file with the same name.");
		}else {
			File nwFile = new File(FOLDER_PATH+"\\"+fname+".txt");
			if(nwFile.createNewFile()) {
				System.out.println("File is created successfully.");
			}
		}
		
	}
	public void writeinFile(String fname, String content) throws IOException {
		File nwFile = new File(FOLDER_PATH+"\\"+fname+".txt");
		FileWriter fw = new FileWriter(nwFile, true);
		fw.write(content);
		fw.close();
		System.out.println("Content is successfully updated.");
	}
	
	public void deleteFile(String fname) throws IOException {
		if(fileIsExist(fname) == 1) {
			Path pt = Paths.get(FOLDER_PATH+"\\"+fname+".txt");
			
			if(Files.deleteIfExists(pt))
				System.out.println("File is deleted....");
			else
				System.out.println("Sorry!!! Unable to delete the file.");
			
		}else {
			System.out.println("File does not exist.");
		}
	}
}
