package assignment7;

public class Patient extends PatientManager {
	//attributes
	private String name;
	private int order;		//order of arrival
	private int emergency; //1 is normal, 5 is life-and-death situation

	//constructor
	public Patient(int order, String name, int emergency) {
		setOrder(order);
		setName(name);
		setEmergency(emergency);
	}

	//getters and setters
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getEmergency() {
		return emergency;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public String toString() {
		return name;
	}
	//Comparable Emergency
	public int compareTo(Patient pE) {
		if(this.getEmergency() > pE.getEmergency()) {
			return 1;
		} else if (this.getEmergency() == pE.getEmergency()) {	
			return Integer.compare(this.getOrder(), pE.getOrder());
		} else
			return -1;
	}
}
