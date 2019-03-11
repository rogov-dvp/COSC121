package LecFeb26;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(10);
		
		System.out.print("Enter integers (input ends with 0): ");
		int n = in.nextInt();
		while (n !=0) {
			if(!list.contains(n))
			list.add(n);
			System.out.print("Enter integers (input ends with 0): ");
			n = in.nextInt();
				
		}
		
		System.out.println(list);
	}
}
