package Mar7;

import java.util.LinkedList;
import java.util.Queue;


public class ExQueue {
	public static void main(String[] args)  {		
			// Queue is Ordered, FIFO.      Stack is LIFO
		
		Queue<String> customers = new LinkedList<>();
	
	
		customers.offer("Mark");
		customers.offer("John");
		customers.offer("Lili");
		
		while(!customers.isEmpty()) 
			System.out.println(customers.poll() + " is served!"); //poll() takes from the bottom. pop() takes from the top
	}
}
