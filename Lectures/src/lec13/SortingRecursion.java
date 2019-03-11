package lec13;

import java.util.Arrays;

public class SortingRecursion {
	public static void main(String[] args) {
		int[] list = {9,4,12,2,6,8,18};
		System.out.println(Arrays.toString(list));
		sort(list);
		System.out.println(Arrays.toString(list));
	}
	
	private static void sort(int[] list) {
		sort(list,0,list.length-1);
	}
	
	private static void sort(int[] list, int low, int high) {
		if(low < high) {
			//find minimum
			int min = list[low], minIdx = low;
			for(int i = low+1; i <= high; i++) {
				if(list[i] <min) {
					min = list[i];
					minIdx = i;
				}
			}
			//swap with current
			list[minIdx] = list[low];
			list[low] = min;
			//repeat
			sort(list, low+1, high);
		} else
			return;
		}
	}

