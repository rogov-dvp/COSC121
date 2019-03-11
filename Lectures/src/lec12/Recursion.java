package lec12;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fib(6));
	}
		public static int factorial(int n) {
			if(n == 0)
				return 1;
			else
				return n*factorial(n-1);
		}

		
		public static int fib(int i) {
			if( i ==0) {
				return 0;
			}
			else if (i == 1)
				return 1;
			else
				return (fib(i-1) + fib(i-2));
		}

		void print(int n) {
			if(n>0) {
				print(n-1);						
				System.out.print(n+" ");
			}
			return;					//at the end, prints : 1 2 3
		}
		
		
}