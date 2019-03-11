package LecFeb28;

import java.util.*;
import java.util.Iterator;

public class ITer {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(String s: list)
			System.out.println(s);
		
		System.out.println("-----------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
	
		}
		System.out.println("-----------------");
		
//	ListIterator<String> x = list.iterator<String>();
//	System.out.println(x.next());
//	System.out.println(x.remove());
//		
	}
	
}
