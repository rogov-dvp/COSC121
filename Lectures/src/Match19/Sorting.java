package Match19;

public class Sorting {

	public static void sort(int[] list) {
		boolean sorted = false;
		for(int i = 0; i < list.length && !sorted; i++) {
			sorted = true;
			for (int j = 0; j < list.length-i-1; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					sorted = false;
				}	
			}
		}
	}

	public static void main(String[] args) {
		// part1 is used for showing sorted output
		int[] a = { 6, 2, 3, 7, 4, 1, 0, 9, 8, 5 };
//		sort(a);
//		printList(a);
		// part2 is used for demonstrating efficiency (we will time the algorithm)
		int N = 100000;
		int[] b = new int[N]; // try different values of N
		initializeRandom(b); // try initialize sorted A/D
		initializeSortedAssending(b);
		double time = System.currentTimeMillis(); // record start time
		sort(b);
		time = System.currentTimeMillis() - time; // compute elapsed time
		System.out.printf("Sorting %d elements took %.3f seconds\n", N, time / 1000);
	}

	static void initializeRandom(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * a.length - a.length / 2);
	}

	static void initializeSortedAssending(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = i;
	}

	static void initializeSortedDescending(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = a.length - i - 1;
	}

	static void printList(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%-3d", a[i]);
		System.out.println();
	}
}
