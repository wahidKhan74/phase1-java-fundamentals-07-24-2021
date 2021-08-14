package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	static String path ="/home/wahidkhan74gmai/PG2-Workspace/phase1-java-fundamentals-07-24-2021/";
	public static void main(String[] args) {
		
		deleteFile("data.txt");
	}

	
	private static void deleteFile(String filename) {
		
		// delete file logic
		try {
			Files.delete(Paths.get(path+filename));
			System.out.println("File is deleted !");
		} catch (IOException e) {
			System.out.println("File Not Found Exception !");
		}
	}
}
