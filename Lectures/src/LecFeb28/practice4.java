package LecFeb28;

import java.util.ArrayList;
import java.util.Iterator;

public class practice4 {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(1);
	list.add(1);
	
	int sum = 0;
	Iterator<Integer> it = list.iterator();
	while(it.hasNext())
		sum += it.next();
	System.out.println(sum);
	}
}
