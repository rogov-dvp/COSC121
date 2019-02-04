package q2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch {
	public static void main(String[] args) throws InputMismatchException {

		// Using catch statement because it is easier to see the logic of the operator
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a simple mathematical formula:");

		boolean status = false;
		double f1 = 0;

		while (!status) {
			try {
				double f2 = 0;
				f1 = in.nextDouble();
				String oper = in.next();
				f2 = in.nextDouble();
				switch (oper) {
				case "-":
					System.out.println(f1 - f2);
					status = true;
					break;
				case "*":
					System.out.println(f1 * f2);
					status = true;
					break;
				case "/":
					System.out.println(f1 / f2);
					status = true;
					break;
				case "+":
					System.out.println(f1 + f2);
					status = true;
					break;
				default:
					System.out.println("Invalid Operator. Try again.");
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid number format. Try again");
				in.next();                   
			}
		}
		in.close();
	}
	}
