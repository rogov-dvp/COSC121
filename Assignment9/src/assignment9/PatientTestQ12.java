package assignment9;

import java.util.ArrayList;

public class PatientTestQ12 {
	public static void main(String[] args) throws CloneNotSupportedException {
//		ArrayList<Patient> list = new ArrayList<>(5);
//		list.add(new Patient(1, "p1", false));
//		list.add(new Patient(2, "p2", false));
//		list.add(new Patient(3, "p3*", true));
//		list.add(new Patient(4, "p4", false));
//		list.add(new Patient(5, "p5*", true));
//
//		// before sorting
//		System.out.printf("%-15s%25s\n", "Before sorting", list); // should be [p1, p2, p3, p4, p5]
//
//		// try bubble sort methods for Q1
////		Sorter.bubbleSort(list);
////		Sorter.bubbleSort(list, new PatientComparator());
//
//		// other sort methods for Q2
////		Sorter.selectionSort(list);
//		Sorter.insertionSort(list);
//
//		// after sorting
//		System.out.printf("%-15s%25s\n", "After sorting", list); // should be [p3, p5, p1, p2, p4]

		
		
		
		
		
		
		// Q3
		
		// I am not sure why my code is much slower. But it works ¯\_(ツ)_/¯ .
		// I have a sneaking suspicion that bubble and selection are similar based on their time of completion 
		
		int patNum = 0;		
		System.out.printf("     N\tBubble Selection Insertion \n");
		
		for (int i = 0; i < 10; i++) {								//This for loops is for running each program, while incrementing by 5000 every time
			
		patNum += 5000;
		ArrayList<Patient> arr = new ArrayList<>(patNum);
		
		for(int n = 0; n < patNum; n++) {							//This for-loop is for making patients based on the number of patients we need
			
			int id = (int)(Math.random()*5001);
			int boolNum = (int)(Math.round(Math.random()));			// rounds up or down based. 1 = true, 0 = false
			boolean bool = (boolNum == 1)? true:false;				// forms the 1 and 0 to a boolean

			arr.add(new Patient(id, "Patient hehexd", bool));
		}
		
		ArrayList<Patient> arr2 = (ArrayList<Patient>)arr.clone();		//clone 2
		ArrayList<Patient> arr3 = (ArrayList<Patient>)arr.clone();		//close 3
		
		
			//Bubble Sort
			long startTime = System.currentTimeMillis();
			Sorter.bubbleSort(arr);
			long endTime = System.currentTimeMillis();
			
			//Selection Sort
			long startTime2 = System.currentTimeMillis();
			Sorter.selectionSort(arr2);
			long endTime2 = System.currentTimeMillis();
			
			//Insertion Sort
			long startTime3 = System.currentTimeMillis();
			Sorter.insertionSort(arr3);
			long endTime3 = System.currentTimeMillis();
			
			
			float time = (float)(endTime - startTime)/1000;
			float time2 = (float)(endTime2 - startTime2)/1000;
			float time3 = (float)(endTime3 - startTime3)/1000;

			
			System.out.printf(" %5d\t %5.3f\t   %5.3f     %5.3f\n",patNum,time,time2,time3);

		}
	}
}
