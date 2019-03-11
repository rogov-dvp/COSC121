package assignment6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) throws IOException {
	
		String f = "c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment6/story.txt";		
		printShuffled(f);
	}
	
	public static void printShuffled(String filename) throws IOException {
		
		File f = new File(filename);
		Scanner in = new Scanner(f);
																			// f.length() == 412
		int numOfSentences = (int) (f.length()/50) ;						// numOfSentences == 8
		ArrayList<String> list = new ArrayList<>(numOfSentences);
		
		
		// Separates sentences through [.:!?], each sentences goes into one index.
		// If there are no more sentences, break out of while loop.
		String s = "";	 
		int length = 0;
		while((in.useDelimiter("[.:!?]") != null)) {			
			if(!in.hasNext())
				break;
			s = in.next();

			list.add(s);
	}
			
		
		//Prints out shuffled. 
		Collections.shuffle(list);
		
		for(String al: list) {
			System.out.print(al.trim()+". ");
			length = al.length();
			if(length>50) {
				System.out.println();
			}
		}
		
		in.close();
		

		
	}
}
