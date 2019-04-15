package assignment9;

public class Patient implements Comparable<Patient>, Cloneable{
	//attributes
	private String name;
	private int order;		//order of arrival
	private boolean emergency; //1 is normal, 5 is life-and-death situation

	//constructor
	public Patient(int order, String name, boolean priority) {
		this.order = order;
		this.name = name;
		this.emergency = priority;
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

	public boolean getEmergency() {
		return emergency;
	}

	public void setEmergency(boolean emergency) {
		this.emergency = emergency;
	}

	public String toString() {
		return name;
	}
	
	public int compareTo(Patient p) {
		 if(this.emergency && !p.emergency ) {
			return 1;
		 } else if (!this.emergency && p.emergency) {
			 return -1;
		} else
			return p.order - this.order;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
