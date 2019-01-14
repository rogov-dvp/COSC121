package lab2;

public class StaffMember{
	
	private String name, address, phone;
	
	StaffMember() {
		this("alex","","");
	}
	StaffMember(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	double pay() {
		return 100;
	}

	@Override
	public String toString() {
		return "StaffMember [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
}
