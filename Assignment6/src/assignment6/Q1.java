package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(5);		//makes an array with capacity of 5
		int u = 0;
		
		System.out.println("Enter five integers");
		for(int i = 0; i < 5; i++) {
			u = in.nextInt();						// 5 integers from user
			list.add(u);							// adds to the list
		}
			
		System.out.println(noDuplicates(list).toString());		// makes newList into a string
		in.close();
	
	}
	public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list){

		ArrayList<Integer> newList = new ArrayList<>();			// newList formed
		
	
		int num = 0;
		for(int i = 0; i < list.size() ; i++) {						
			
			num = list.get(i);									
			newList.add(num);								// copy list --> newList
			
			if(newList.indexOf(num) != newList.lastIndexOf(num)) {		// If a duplicate exists...
				newList.remove(newList.lastIndexOf(num));				// get rid of the last
			}
		}
		return newList;
	}
}
