package Mar7;

import java.util.LinkedList;
import java.util.ListIterator;

public class RealLecture {
	public static void main(String[] args) {
		// Linked list
		//
		
		LinkedList<Integer> list = new LinkedList<>();				// O(n^2)
		for(int i = 0; i < 100; i++) 
			list.add(i);
		
		ListIterator<Integer> it = list.listIterator();				//Needs to be imported
		while(it.hasNext()) it.next();								// Goes alll the way to end. O(n)
		while(it.hasPrevious()) System.out.println(it.previous()); //O(n) technically O(2n)	// Prints backwards
	}
}
