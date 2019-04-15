package assignment7;

import java.util.Comparator;

public class ComparatorE implements Comparator<Patient> {

	public int compare(Patient p1, Patient p2) {
		if(p1.getEmergency() == p2.getEmergency()) {	// if emergency are equal, order is decided
			if(p1.getOrder() > p2.getOrder())			// Larger order goes after smaller order		
				return 1;
			else
				return -1;
		} else if (p1.getEmergency() < p2.getEmergency()) {
			return 1;
		} else
			return -1;

	}

	
}
