package lab1;

public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;
	private static int count;
	
	Person() {
		setName("");
		setAddress("");
		setPhone("");
		setEmail("");
		count++;
	}
	Person(String name, String address, String phone, String email) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		count++;
	}
	// methods
	
	public static int getCount() {
		return count;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
