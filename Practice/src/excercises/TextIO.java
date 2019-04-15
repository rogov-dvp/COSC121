package excercises;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIO {
	public static void main(String[] args) {
		copy("c://source.txt","c://Users/alexa/OneDrive/Documents/UBC/2019s/cosc121/destination.csv" );
		
	}
	public static void copy(String sourceFile, String destFile) {
		File source = new File(sourceFile);
		File dest = new File(destFile);
		boolean canCopy = true;
		
		if(!source.exists()) { 		//If does NOT exist, print a msg.
			System.out.println("File does not exist");
			canCopy = false;
		}
		
		if(dest.exists()) {
			System.out.println("Do you want to overwrite " + dest.getName() + "---- (Y or N)");
			Scanner in = new Scanner(System.in);
			char ans = in.next().trim().charAt(0);
			if( ans != 'Y' && ans != 'y') {
				System.out.println("Destination will not be overwritten. Operation cancelled!");
				canCopy = false;
			}
		}
		
		if(canCopy) {
			try(Scanner in = new Scanner(source); PrintWriter out = new PrintWriter(dest)) {
				while(in.hasNext()) {
				//read and write last name
					in.next();
					in.next();			//gets rid of "Last" and "Name:"
					out.print(in.next() + ","); // read last name and print it to destination file
				//read and write first name
					in.next();
					in.next();			//get rod of "First" and Name:"
					out.print(in.next() + ",");	// read first name and print it to the destination file
				//read and write age
					in.next();			//get rid of "Age:"
					out.print(in.next() + ","); // can also use in.nextInt() but we don't have to read int as integer
				//read and write ID
					in.next();			// read ID from source.txt and put it into destination.txt followed by a new line
					out.println(in.next());
				}
				System.out.println("Copy finished. ");
			} catch (IOException e) {
				System.out.println("Unknown I/O error");
//\				e.printStackTrace();
			}
		}
	}

	
}
	
