package lec7;

import java.io.File;
import java.util.Scanner;



public class Ex5 {

	public static void main(String[] args) throws Exception {
		//1) open stream
		File source = new File("c:/2/students.txt");
		Scanner in = new Scanner(source);
		//2) read everything in the file
		while(in.hasNextLine()) {
			System.out.println("Name: " + in.next());
			System.out.println("A1: " + in.nextDouble()/.50 + "%");
			System.out.println("A2: " + in.nextDouble()/.50 + "%");
		}
		//3) close stream
		in.close();
	}

}
