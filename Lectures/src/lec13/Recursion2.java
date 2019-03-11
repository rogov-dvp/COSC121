package lec13;

public class Recursion2 {
	public static void main(String[] args) {
		
		nPrint("ABC", 5);
		
	}
	
	private static void nPrint(String s, int n) {
		//base cases
		if(n > 0) {
		System.out.println(s);
		nPrint((n-1)+"", n-1);
		}
		System.out.println();
	}		
}
