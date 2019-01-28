package lec6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
	public static void main(String[] args) throws FileNotFoundException {
		//open stream
		File source = new File("c:/5/text.txt");
		Scanner in = new Scanner(source);
		//read file
		while(in.hasNextLine())
		System.out.println(in.nextLine());
		//close stream
		in.close();
	}
}
