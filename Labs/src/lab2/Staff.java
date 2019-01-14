	package lab2;

public class Staff {
	
		StaffMember[] staff = new StaffMember[6];
		public Staff() {
		staff[0] = new StaffMember();
		staff[1] = new Volunteer();
		staff[2] = new Employee();
		staff[3] = new Executive();
		staff[4] = new Executive();
		staff[5] = new Hourly();
		}

		
	void payday() {
		for ( StaffMember x: staff) {
			if(!(x instanceof Volunteer))
			System.out.println(x.pay());
		}
	}
		
}


