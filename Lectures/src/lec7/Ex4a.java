package lec7;

import java.io.File;
import java.util.Scanner;



public class Ex4a {

	public static void main(String[] args) throws Exception {
		//1) open stream
		File source = new File("c:/2/test.txt");
		Scanner in = new Scanner(source);
		//2) read everything in the file
		while(in.hasNextLine())
			System.out.println(in.nextLine());
			
		//3) close stream
		in.close();
	}

}
