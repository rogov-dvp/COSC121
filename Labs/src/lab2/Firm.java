package lab2;

public class Firm {
	public static void main(String[] args) {
		Staff s = new Staff();
		Executive e = new Executive();
		Hourly h = new Hourly();
		StaffMember sm = new StaffMember("Alex", "125 Dundas", "778-855-5170");
		e.awardBonus(777);
		h.addHours(10);
		
		s.payday();
	}
}
