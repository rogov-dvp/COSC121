package lec18;

public class Ex1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 7, 9, 13, 27, 45, 67,88, 99 };
		System.out.println(find(a,67));
	}

	private static int find(int[] a, int key) {
		return find(a, key, 0, a.length - 1);
	}

	private static int find(int[] a, int key, int low, int high) {	// Moves the high and low points 
		int mid = (low+high)/2;
		if(low>high) return -1;
		if(key == a[mid])
			return mid;
		else if (key >mid) 
			return find(a,key,mid+1,high);
		else //if(key<a[mid])
				return find(a,key,low,mid-1);
		
	}
}
