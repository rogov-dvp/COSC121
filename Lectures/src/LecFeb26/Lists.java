package LecFeb26;

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<String>(4);    // You don't have to write String on the right side. /
//		ArrayList list1 = new ArrayList();			//Dynamic size, if not specified, capacity of 10. Type: Object, can store any type
		ArrayList<String> list = new ArrayList<String>();			// Capacity: 4, Type of reference: Object   ------ bc it is not specified
		
		
		list.add("hi");
		list.add("hehexd");
		
		System.out.println(list.size());
		System.out.println(list.toString());
		//specific item
//		list.set(0,"m");					// Replaces an existing object in the ArrayList
//		System.out.println(list.toString());
//
//		System.out.println("-----------------------");
	}
}

