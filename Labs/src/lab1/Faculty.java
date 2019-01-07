package lab1;

public class Faculty extends Employee{
	
	private String officeHour;
	private String rank;
	
	Faculty() {this("","","","","","");}
	Faculty(String name, String address, String phone, String email, String officeHour, String rank) {
		super(name,address,phone,email);
		setOfficeHour(officeHour);
		setRank(rank);
	}
	
	
	public String getOfficeHour() {
		return officeHour;
	}
	public void setOfficeHour(String officeHour) {
		this.officeHour = officeHour;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	@Override
	public String toString() {
		return "Faculty [officeHour=" + officeHour + ", rank=" + rank + "]";
	}	
}
