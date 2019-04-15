package assignment7;


import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientManager {
	PriorityQueue<Patient> waitingList = new PriorityQueue<>(20, new ComparatorE());
	int[] orderList = new int[5]; // a list of integers. Each integer represents the order in the corresponding emergency levels

	public void start() {
		Scanner in = new Scanner(System.in);
		boolean exit = false;

		System.out.println("------------------------------------");
		System.out.println("\t(1) New Patient.");
		System.out.println("\t(2) Next Patient.");
		System.out.println("\t(3) Waiting List. ");
		System.out.println("\t(4) Exit.");
		System.out.println("------------------------------------");

		do {																							// start of the do-while loop. press 4 for exit
			System.out.print("* Choose an item from the menu: ");
			int user = 0;
			boolean pass = false;
			
			while(pass == false) {
				try {
			user = in.nextInt();
			
			while (user < 1 || user > 4 ) {
				System.out.print("[X] Invalid, Try again: \n");
				System.out.print("* Choose an item from the menu: ");
				user = in.nextInt();
			}
			in.nextLine();
			pass = true;
			} catch (InputMismatchException e) {
				System.out.println("[X] Invalid, Try again: ");
				in.nextLine();
				break;
			}
			} 

			// Option 1 -------------------------------------------------------------------------------------------------------------
			switch (user) {
			case 1:
				int emergency = 0;
				pass = false;
				
				System.out.print("Enter patient's name: ");
				String name = in.nextLine();
				System.out.print("Enter Emergency level [1 (low) to 5 (life-and-death)]: ");
				
				while(pass == false) {
				try {
				emergency = in.nextInt();
				while (emergency < 1 || emergency > 5) {												//Defensive programming for emergency levels
					System.out.print("[X] Invalid, Try again: ");	
					emergency = in.nextInt();
				}
				in.nextLine();
				pass = true;
				} catch (InputMismatchException e) {
					System.out.print("[X] Invalid, Try again: ");
					in.next();
				}
				}
				
				Patient p = new Patient(orderList[emergency - 1]++, name, emergency);
				waitingList.offer(p);				//Patient added to waitingList *****
				

				
				
				System.out.println("Patient added to the waiting list.\n");

				break;
				
				
			// Option 2 --------------------------------------------------------------------------------------------------------------
			case 2: // option 2: Display name in priority queue and remove him/her from queue

				if(waitingList.isEmpty())
					System.out.println("- No more patients.");
				else
				System.out.println(waitingList.poll() + " is treated.\n");
				break;

				
			// Option 3 ---------------------------------------------------------------------------------------------------------------
			case 3: //Display full list of all patients that are still in the queue
				
				PriorityQueue<Patient> pqTemp = new PriorityQueue<>(waitingList);			//temporary copy PriorityQueue so we can poll 

				if(pqTemp.isEmpty()) {
						System.out.println("- No patients in the list.");
				} else {
				System.out.println("Waiting list includes:");
				while (pqTemp.isEmpty() == false) {
					System.out.println("- " + pqTemp.poll());
				}
				System.out.println();
				}
				break;

				
			// Option 4 ----------------------------------------------------------------------------------------------------------------
			case 4: 
				System.out.println("Program terminated. Good Bye!");
				exit = true;												// allows for program to exit
				break;
			
			}
			
		} while (exit == false);

		in.close();
	}
	

}
