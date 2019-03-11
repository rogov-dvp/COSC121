package Mar7;

import java.util.Comparator;

public class PatientCriteria2 implements Comparator<Patients> {

	public int compare(Patients p1, Patients p2) { // purpose: 
		return p1.order - p2.order;
	}
	
	
}
