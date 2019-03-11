package assignment4;

import java.io.*;

public class Q1 {
	public static void main(String[] args) throws IOException{
				
				
		File f = new File("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/count.dat");
				if(f.exists()) {																												// checks if file exists
					 FileInputStream fis = new FileInputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/count.dat");
					 int num = fis.read();																										// Reads the num before deleting it in next line
					 FileOutputStream fos= new FileOutputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/count.dat");	// Makes a new file and gets rid of the num 
					 fos.write(num + 1);																										// prints the incremented num from the previous file
					 fos.close();																												// closes output then input streams...
					 fis.close();
					 					 
				} else {																														// creates file is does not exist
				 FileOutputStream fos= new FileOutputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/count.dat");
					fos.write('0'+ 1);																											// Writes number 1 in it
					fos.close();																												// Closes output stream
					}

	}
}
