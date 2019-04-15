package March28;


public class Ex3 {
	public static void main(String[] args) {
	

		
		MathOp add = (int a, int b) -> {
			return a + b;
		};
		MathOp sub = (a, b) -> a - b;
		MathOp mul = (a, b) -> a * b;
		MathOp div = (a, b) -> a / b;

		process(5,4, add);
		process(3,2, sub);
	}
	public static void process(int a, int b, MathOp op) {		//function as a parameter
		System.out.println(op.apply(a,b));
		//.....
	}

}


interface MathOp {
	int apply(int a, int b);
}
