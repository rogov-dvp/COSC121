package Mar7;

public class Patients implements Comparable<Patients>{
		String name;
		int order;
		int emergency; // 5 emergence ... 1 not emergency
		
	

	public Patients(String name, int order, int emergency) {
		this.name = name;
		this.order = order;
		this.emergency = emergency;
	}


	public String toString() {
		return "PatientsPriotyQueue [name=" + name + ", order=" + order + ", emergency=" + emergency + "]";
	}
	
	public int compareTo(Patients other) {
		return this.emergency - other.emergency;
	}
	

	
}
	

