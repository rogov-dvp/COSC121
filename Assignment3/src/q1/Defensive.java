package q1;

import java.util.Scanner;

public class Defensive {
	public static void main(String[] args) {
		
		int[] arr = new int[50];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50);
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number from 0-49: ");
		int numUser = in.nextInt();
		while(numUser > 49 || numUser < 0) {
			System.out.println("Out of Bound. Try again: ");
			numUser = in.nextInt();
		}
		in.close();
			
		System.out.printf("The element is %d", arr[numUser]);
	}
}
