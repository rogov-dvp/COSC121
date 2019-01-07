package lab1;

public class Staff extends Employee{

	private String title;

	Staff() {this("","","","","");}
	Staff(String name, String address, String phone, String email, String title) {
		super(name,address,phone,email);
		setTitle(title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}
}
