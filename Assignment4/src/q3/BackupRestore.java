package q3;

import java.io.*;

public class BackupRestore {
	public static void main(String[] args) {					// syllabus.pdf

		
		
		String filename = "c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment4/";			// director file
		restore(filename,backup(filename,0.25));														
	}
	
	public static int backup(String filename, double partSize) {
		try {
			
		int numberOfPieces = 0;
		File f = new File(filename + "syllabus.pdf");
		DataInputStream dis = new DataInputStream (new BufferedInputStream(new FileInputStream(filename + "syllabus.pdf")));		// Taking info from PDF
		DataOutputStream dos = null;
	
		
		double TotalSizeMB    = (double)f.length()/(1024*1024);								// Total size of PDF in MB (~ 0.875022888)
		numberOfPieces      = (int)Math.ceil(TotalSizeMB/partSize);						// Used to calculate how many new files we need ( ~ 3.500092). Rounded to 4 files required
		
		double perFileBytes = (double)(f.length() - 250000); 					// f.length() == Total bytes . 250000 bytes == 0.25MB
		
		for(int i = 0; i < numberOfPieces; i++) {								// For loop to insert the info from the PDF to each file piece
			
			File newF = new File(filename + "file" + i + ".txt");				// The formula for making each file piece
			if(newF.exists()) 													// deletes if exists (Used when running/testing this program)
				newF.delete();
			
			dos = new DataOutputStream ( new BufferedOutputStream(new FileOutputStream(newF,true)));		// OutputStream for each new file pieces. "true" because it needs to add to what exists
			while(dis.available() > (f.length() - (perFileBytes)*i))  {								// condition: allowing to take only 0.25MB for each file piece
				dos.write(dis.read());																// Reads and writes into files
				System.out.println(dis.available());												// Used for checking purposes to see how many more bytes it needs to go through
			}
			dos.close();
		}
		dis.close();
		
		f.deleteOnExit();                                                        // deletes PDF when done
		
		return numberOfPieces;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}

	}
	public static int restore(String filename, int numberOfPieces) {
		try {	
			DataInputStream dis = null;
			File newF = new File(filename + "fileMain.txt");											// Main file which all file pieces are combined into
			int fileSize = 0;
			
			if(newF.exists()) 																			// deletes if exists
				newF.delete();
		
			DataOutputStream dos = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(newF)));
			
			for(int i = 0; i < numberOfPieces; i++) {													// Go through each pieces, copies it and prints it
				File f = new File(filename + "file" + i + ".txt");										// formula for finding each file
				dis = new DataInputStream (new BufferedInputStream(new FileInputStream(f)));
				
				fileSize += dis.available();															// Adds up the size from each file piece to find the total file size in fileMain

				while(dis.available() > 0) {
					dos.write(dis.read());																// reads and writes file
				}	
				dis.close();
			}
			
			dos.close();
				
			
			
		return fileSize;																	
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

}
