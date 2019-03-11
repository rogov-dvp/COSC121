package Recursion;

import java.io.*;
import java.util.Arrays;

	/* MAIN: first get folder for which you want to read from. Call initial listAllFiles(1) which checks if it is a directory and initialized spaces.
	 * listAllFiles(2): Makes an array, if file --> print, if directory --> print the folder name, add spaces, check if something exists in folders,
	 *  Does a for each loop of every file. In the for each loop, it does a recursion with the update spaces value, and files value.
	 */


public class Q4 {
	public static void main(String[] args) {
		File f = new File("c:/Users/alexa/OneDrive/Documents/resumes");
		listAllFiles(f);
	}
	static void listAllFiles(File dir) {
		String spaces = "";
		if (dir.isDirectory()) 
			listAllFiles(dir,spaces);
	}
	
	static void listAllFiles(File dir, String spaces) {
		File[] files = dir.listFiles();
		
			if(dir.isFile()) {
				System.out.println(spaces + dir.getName());
			}else if(dir.isDirectory()) {
				System.out.println(spaces + "[" + dir.getName().toUpperCase() + "]");
				spaces += "   ";
				if(files!=null) {
					for(File e: files) {
						listAllFiles(e,spaces+"  ");}
			}
		}}
	}

