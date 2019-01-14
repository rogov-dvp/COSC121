package lab1;

import java.util.Date;

public class Employee extends Person {

	private String office;
	private int salary;
	private Date dateHired;
	
	Employee() {this("","","","");}
	Employee(String name, String address, String phone, String email) {
		super(name,address,phone,email);
	}
	Employee(String name, String address, String phone, String email, String office, int salary, Date dateHired) {
		super(name,address,phone,email);
		setOffice(office);
		setSalary(salary);
		setDateHired(dateHired);
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}
	
	
}
