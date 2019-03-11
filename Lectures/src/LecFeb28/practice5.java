package LecFeb28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class practice5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		ListIterator<String> it = list.listIterator();
		while(it.hasNext())
			System.out.println(it.next());
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(3); list1.add(4); list1.add(7); list1.add(9);

//		list1.remove(9);
		System.out.println(list1.remove(Integer.valueOf(9)));
	}
}		// Integer.valueOf(9)   == new Integer(9) 

