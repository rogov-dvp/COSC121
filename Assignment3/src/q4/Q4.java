package q4;

import java.io.*;
import java.util.*;

public class Q4 {
	public static void main(String[] args) throws IOException {

		// Source and Destination goes here:
		String censoredWords[] = { "ABC", "XYZ" };
		File myFile = new File("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment3/source.txt");
		PrintWriter pw = new PrintWriter("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/Assignment3/destination.txt");
		Scanner in = new Scanner(myFile);
		
		
		while (in.hasNext()) {
			String s = in.nextLine();
			pw.println(replaceCensoredWords(s, censoredWords).toUpperCase() + " ");
		}
		in.close();
		pw.close();
		
		
	}

	private static String replaceCensoredWords(String line, String[] censoredWords) throws IOException {
		for (int i = 0; i < censoredWords.length; i++)
			line = line.toUpperCase().replace(censoredWords[i], "...");
		return line;
	}
}
