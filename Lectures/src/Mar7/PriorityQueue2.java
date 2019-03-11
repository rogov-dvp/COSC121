package Mar7;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<Patients> patients = new PriorityQueue<>(4, new PatientCriteria2());
		
		patients.offer(new Patients("A",1,3));
		patients.offer(new Patients("B",2,1));
		patients.offer(new Patients("C",3,5));
		patients.offer(new Patients("D",6,2));
		patients.offer(new Patients("E",7,3));
	
		while(!patients.isEmpty())
			System.out.println(patients.poll());
		
	}
	
}
