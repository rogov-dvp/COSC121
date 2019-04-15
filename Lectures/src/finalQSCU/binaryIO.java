package finalQSCU;

public class binaryIO {
	public static void main(String[] args) {
	
		
	MathOp add = (a,b) -> a+b;	
	System.out.println(add);

	
	}
	
	interface MathOp{
		double apply(double a, double b);
	}
	
	
	
}
