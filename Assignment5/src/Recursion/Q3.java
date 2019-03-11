package Recursion;

import java.util.Scanner;

	/*
	 * MAIN: Ask user for string and char. starting from first char to the last, compare letter at index 
	 * to letter of interest in the helper() method. helper() method returns 1 if true, and 0 if not. If
	 * it returns 1, then it is summed up and the counter increments the amount of matching letters. Finally,
	 * printing the statement of the values when index equals to string length, without repeat a recursion.
	 */




public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = in.nextLine();
		System.out.print("Enter a character: ");
		char c = in.next().charAt(0);
		charCount(str,0,0,c);
		
		in.close();
	}
	
	public static int helper(String str, int index, char c) {	// string, which index of string, char of interest 
		char current = str.charAt(index);
		if(current == c) {
			return 1;
		}
		else
			return 0;
	}
	
	public static void charCount(String str,int index,int counter, char c) {
		if(index == (str.length()-1)){			
			counter += helper(str,index,c);
			System.out.printf("%c appears %d time(s) in \"%s\"",c,counter,str);
		}else {
			counter += helper(str,index,c);	
			charCount(str,++index,counter,c);
		}
	}
}
