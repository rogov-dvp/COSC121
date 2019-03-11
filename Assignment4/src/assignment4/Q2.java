package assignment4;

import java.io.*;

public class Q2 {
	public static void main(String[] args) {
													
		// 				Also, please note that my "filename" happens to be the content in data.dat . Not the actually filename lol. Don't mean to confuse ya
		
		try {
		File f1 = new File("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/Q2OutputFile.dat"); // given)
		if (f1.exists()) {
			f1.delete();
		}
			File f = new File("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/data.dat"); // Input File
																											// (data.dat
																											// which is
																											// given)
			DataInputStream fis = new DataInputStream(new FileInputStream(f));

			int eof = fis.available();
			String filename = "";
			int counter = 1;
			
			while (eof != 0) {
				filename = Integer.toHexString(fis.read());			 // String: filename. Converts int to String
				if (counter%16 == 0) {
					viewHex(filename); 								 // searched up how to put a new line. \n was not working for me	
					viewHex(System.lineSeparator());				 // 0 to reset the loop since it starts at a new line
				} else if (counter%8 == 0) { 						 // adds "|"
					viewHex(filename);
					viewHex(" |");								  	 // I put a space before | because hex requires two characters to be printed normally
				} else {
					viewHex(filename);

				}
				eof--;																			
				counter++;											 // counter for when to put | and a new line
			}
			fis.close();
			System.out.println("done!");

		} catch (IOException e) {
			System.out.println("IOException occured");
		}
	}

	private static void viewHex(String filename) {														          	
		try {
			File f = new File("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/Q2OutputFile.dat");  // Input																									// File
			DataOutputStream fos = new DataOutputStream(new FileOutputStream(f, true));								// True, so that UTF notation adds on during the loop in main


			if(filename.length() < 2)																				//To change a single 0 (which it gives me) to 00
				filename = "0" + filename;
			fos.writeUTF(filename.toUpperCase());																    // Writes on to the output file
			fos.close();																					// closes output stream
		} catch (IOException e) {
			System.out.println("IOException occured");
		}
	}
}