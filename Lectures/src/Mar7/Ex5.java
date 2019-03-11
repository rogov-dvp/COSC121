package Mar7;

import java.util.Stack;

public class Ex5 {
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		String s = "abcde";
		for(int i = 0; i< s.length();i++) 		// use String size 
			stack.push(s.charAt(i));			
		
		
		for(int i =0; i < stack.size(); i++) {			// Problem since stack.size() decreases and i increases
			System.out.println(stack.get(i));
		}
		
	}
	
}
