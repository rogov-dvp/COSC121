package LecFeb28;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek());
		while(!(stack.pop() == null)) {
		System.out.println(stack.pop());
		}


	
	
	}
}
