package Recursion;

public class Q1 {
	
	/*
	 * Base case is when i reaches the last number(i.e. 5). It creates the new sum and 
	 * prints out the statement without it being followed by a recursion call. 
	 * Everything before it creates a new sum, prints the statement, followed with a recursion call
	 * with an updated 'sum' and 'i' values.
	 */
	
	public static void main(String[] args) {
		rec(1, 0);	
	}
	
	public static void rec(int i, double sum) {
		
		if( i == 5) {											//Base case
			sum += (double)1/(2*i);
			System.out.printf("i = %d\tf(%d) = %.2f",i,i,sum);
		} else {
			sum += (double)1/(2*i);
			 System.out.printf("i = %d\tf(%d) = %.2f\n",i,i,sum);
			 rec(++i, sum);
		}
		
			
	}
}
