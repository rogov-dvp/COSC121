package Mar7;

import java.util.Stack;

public class Ex3Stack {
	public static void main(String[] args) {
		System.out.println(isPal("abc"));
	}
	
	public static boolean isPal(String s) {
		Stack<Character> stack = new Stack<>();
		String s2 = "";
		for(int i = 0; i< s.length(); i++) 
			stack.push(s.charAt(i));
			while(!stack.isEmpty())
				s2 += stack.pop();
			
		return (s.equals(s2));
	}
}
