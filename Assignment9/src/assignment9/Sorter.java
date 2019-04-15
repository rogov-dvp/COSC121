package assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorter {
	
	
	// tbh, For bubbleSorted methods. I was playing around with this and
	// made this new(?) sorting technique. It seems like a bubble sort
	
	
	
	public static void bubbleSort(ArrayList<Patient> list) {

		boolean sorted = false;
		Patient temp = null;
		int counter = 1;
		while (counter != 0) {
			counter = 0;
			for (int k = 0; k < list.size() - 1 && !sorted; k++) {

				if (list.get(k + 1).compareTo(list.get(k)) > 0) {
					temp = list.get(k);
					list.set(k, list.get(k + 1));
					list.set(k + 1, temp);
					counter++;
				}

			}
			if (counter > 0) {

			}
		}
	}

	public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comparator) {


		boolean sorted = false;
		Patient temp = null;
		int counter = 1;
		while (counter != 0) {
			counter = 0;
			for (int k = 0; k < list.size() - 1 && !sorted; k++) {
				if (comparator.compare(list.get(k + 1), (list.get(k))) < 0) {

					temp = list.get(k);
					list.set(k, list.get(k + 1));
					list.set(k + 1, temp);
					counter++;
				}

			}
			if (counter > 0) {
			}
		}

	}

	public static void selectionSort(ArrayList<Patient> list) {

		Patient temp = null;
		for (int index = 0; index < list.size(); index++) {
			int idxMin = index;
			for (int scan = index + 1; scan < list.size(); scan++) {
				if (list.get(idxMin).compareTo(list.get(scan)) < 0) {
					idxMin = scan;
				}

				temp = list.get(index);
				list.set(index, list.get(idxMin));
				list.set(idxMin,temp);
			
			}
			
		}

	}

	public static void insertionSort(ArrayList<Patient> list) {
		
		Patient item = null;
		
		for (int i = 1; i < list.size(); i++) {
			item = list.get(i);
			int pos = i;
			while(pos>0 && item.compareTo(list.get(pos-1)) > 0) {				
				list.set(pos, list.get(pos-1));
				pos--;
			}
			list.set(pos, item);
		}

	}

}
