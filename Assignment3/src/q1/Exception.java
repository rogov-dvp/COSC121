package q1;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		
		int[] arr = new int[50];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50);
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number from 0-49: ");
		int numUser = 0;
		
		boolean status = false;
		
		while(status == false ) {
		try {
		numUser = in.nextInt();
		System.out.printf("The element is %d", arr[numUser]);
		status = true;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Out of Bounds. Try again:");	
		}
		}
		in.close();	
		
		
	}
}
