package Recursion;

import java.util.Scanner;

	/*
	 *  MAIN(): Scanner --> ask user for string --> call reverse() method
	 *  REVERSE(): find index of current string --> call helper() to find last char of the current string.
	 *  --> prints the char --> takes new string via substring()
	 *  The current string decreases by 1 for every recursion because index decreases by 1. 
	 *  The substring takes off the last letter of the current string everytime (until string is one letter long) 
	 */

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		reverse(str);
		
		in.close();
	}
	
	public static char helper(String str, int index) {
		char c = str.charAt(index);  
		return c;
	}
	
	public static void reverse(String str) {
		int index = str.length()-1;

		if(index == 0) {
			System.out.print(helper(str,index));
		}
		else {
			System.out.print(helper(str,index));
			reverse(str.substring(0,index));
		}
	}	
	
}
