package lec7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex10 {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		boolean valid = false;
		while (!valid) {
			try {
				System.out.print("a: ");
				int a = in.nextInt();
				System.out.print("b: ");
				int b = in.nextInt();
				System.out.println(a / b);
				valid = true;
				in.close();
			} catch (ArithmeticException e) {
				System.out.println("Arith error.");
			} catch (InputMismatchException e) {
				System.out.println("Wrong type input");
				in.nextLine();								//clears the previous input stream
															// So that it doesn't repeat when it goes back up
															// to try.
			}
		}
	}
}
