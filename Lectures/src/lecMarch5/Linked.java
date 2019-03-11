package lecMarch5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(7);
		
		
		LinkedList<String> list = new LinkedList<>(); // NO SPACE IS RESERVED // Used for when constant change of 
													//	elements through the entire LinkedArray
		
		list.add("A");		// head and tail point to last element( both if only one element)
		list.add("B");		// tail moves to the last element (i.e 7)
		list.addFirst("C");		// head and tail change. (i.e. head moves when addFirst())
		list.removeLast();		// So you dont have to shift the rest of the elements(ArrayList) to add something at the beginning
		System.out.println(list.toString());	// Linked list just changes head, thats it
		
					// LinkedList takes any space available
		
		
		
	}
}
