package q3;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) throws NumberFormatException{

	// The type of exception thrown is NumberFormatException. 
	// This exception happens when you use the "parse" method and the number format does not match the parse statement.
	// eg. "+" can't be turned into a double. Also,
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a simple mathematical formula:");

		boolean status = false;
		

		while (!status) {
			try {
				String s1 = in.next();
				String oper = in.next();
				String s2 = in.next();
				
				double d1 = Double.parseDouble(s1);
				double d2 = Double.parseDouble(s2);

				switch (oper) {
				case "-":
					System.out.println(d1 - d2);
					status = true;
					break;
				case "*":
					System.out.println(d1 * d2);
					status = true;
					break;
				case "/":
					System.out.println(d1 / d2);
					status = true;
					break;
				case "+":
					System.out.println(d1 + d2);
					status = true;
					break;
				default:
					System.out.println("Invalid Operator. Try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid number format. Try again");
				in.nextLine();
			}

		}
		in.close();
	}

}
