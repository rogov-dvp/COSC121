package lec18;

public class TowerOfHanoi {
	public static void main(String[] args) {
		hanoi(8, 'A', 'B', 'C');		// You can change the int to what you want
	}

	private static void hanoi(int n, char a, char b, char c) {
		if(n==1)
			System.out.printf("move %d from %c to %c\n", n ,a ,b);
		else {
			hanoi(n-1,a,c,b);
		System.out.printf("move %d from %c to %c\n", n ,a ,b);
			hanoi(n-1,c,b,a);
		}
	}
}
