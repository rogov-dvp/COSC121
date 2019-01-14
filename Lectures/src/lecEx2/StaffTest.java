	package lecEx2;


public class StaffTest {
	public static void main(String[] args) {
		Staff st = new Staff();
		st.payEveryone();
	}
}

class Staff{
	StaffMember[] staff = new StaffMember[6];
	public Staff() {
	staff[0] = new Volunteer();
	staff[1] = new Hourly();
	staff[2] = new Hourly();
	staff[3] = new Hourly();
	staff[4] = new Executive();
	staff[5] = new Executive();
	}
	void payEveryone() {
		for(StaffMember s: staff) {
			s.pay();
		}
	}
}

class StaffMember {
	void pay() {}
}
class Volunteer extends StaffMember {
	void pay() {System.out.println("No payment");}
}
class Employee extends StaffMember{
	void pay() {System.out.println("Paied annually");}
}
class Executive extends Employee{
	void pay() {System.out.println("Paied most of the money");}
}
class Hourly extends Employee {
	void pay() {System.out.println("Paied by the hour");}
}
