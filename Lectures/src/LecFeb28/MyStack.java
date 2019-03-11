package LecFeb28;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<String> list = new ArrayList<>();

	
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	//main operations
	public int size() {
		return list.size();
	}
	public void push(String item) {
		list.add(item);
	}
	public String pop() {
		if(!isEmpty()) 
		return list.remove(list.size()-1); //removes top element
		else
		return null;
		
	}
	public String peek() {
		if(!isEmpty())
	return list.get(list.size()-1);	//Looks at the top of the list	
									// Error if stack is empty
		else
		return null;
	}
}
