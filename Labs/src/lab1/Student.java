package lab1;

public class Student extends Person{

	private String status;
	
	
	Student() {this("","","","","");}
	Student(String name, String address, String phone, String email,String status) {
		super(name,address,phone,email);
		setStatus(status);
	}
	
	// methods
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Student [status=" + status + "]";
	}
	
}
