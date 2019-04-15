package march21;

public class AdvancedSorting {
	public static void sort(int[] list) {
		if(list.length >1) {
			//split list into half
			
//			half1 = 1st half of list;
//			half2 = 2nd half of list;
			int length1 = list.length/2;
			int length2 = list.length - length1;
			int[] half1 = new int[length1];
			int[] half2 = new int[length2];
			System.arraycopy(list, 0, half1, 0, length1);
			System.arraycopy(list, length1, half2, 0, length2);

				//recursively sort each half
			sort(half1);
			sort(half2);
			//merge 2 halves back
			merge(half1,half2,list);
	}
	}
	public static void merge(int[] half1, int[] half2, int[] list) {
		int c1=0, c2=0, c=0;   //c stands for "current". points at index
		//merge the two halves in order
		while(c1<half1.length && c2<half2.length) {
			if(half1[c1] < half2[c2])
				list[c++] = half1[c1++];
			else
				list[c++] = half2[c2++];	
		}
		//put remaining elements from either halves into list
		while(c1<half1.length)
			list[c++] = half1[c1++];
		while(c2<half2.length)
			list[c++] = half2[c2++];
	}
	
	
	
	public static void main(String[] args) {
		// part1 is used for showing sorted output
		int[] a = { 6, 2, 3, 7, 4, 1, 0, 9, 8, 5 };
		sort(a);
		printList(a);
		// part2 is used for demonstrating efficiency (we will time the algorithm)
		int N = 10000000;
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
	
	// MERGE SORTING
//	public static void sort(int[] list) {
//		if(list.length >1) {
//			//split list into half
//			
////			half1 = 1st half of list;
////			half2 = 2nd half of list;
//			int length1 = list.length/2;
//			int length2 = list.length - length1;
//			int[] half1 = new int[length1];
//			int[] half2 = new int[length2];
//			System.arraycopy(list, 0, half1, 0, length1);
//			System.arraycopy(list, length1, half2, 0, length2);
//
//				//recursively sort each half
//			sort(half1);
//			sort(half2);
//			//merge 2 halves back
//			merge(half1,half2,list);
//	}
//	}
//	public static void merge(int[] half1, int[] half2, int[] list) {
//		int c1=0, c2=0, c=0;   //c stands for "current". points at index
//		//merge the two halves in order
//		while(c1<half1.length && c2<half2.length) {
//			if(half1[c1] < half2[c2])
//				list[c++] = half1[c1++];
//			else
//				list[c++] = half2[c2++];	
//		}
//		//put remaining elements from either halves into list
//		while(c1<half1.length)
//			list[c++] = half1[c1++];
//		while(c2<half2.length)
//			list[c++] = half2[c2++];
//	}

}
