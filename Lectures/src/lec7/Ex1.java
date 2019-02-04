package lec7;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int[] a = {4, 8, 6};
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a values: ");
		int x = in.nextInt();
		try {
			System.out.println("MAIN 1");
			divide(a, x);
			System.out.println(a[0]);
		}catch(Exception e) {
			System.out.println("Error");
		}
		System.out.println("MAIN 2");

	}

	private static void divide(int[] a, int x) throws ArithmeticException{
		System.out.println("M1");
		for(int i =0; i<a.length; i++)
			a[i] = a[i] / x;
		System.out.println("M2");
	}
}
