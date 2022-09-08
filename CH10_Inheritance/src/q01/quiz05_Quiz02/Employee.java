package q01.quiz05_Quiz02;

public class Employee extends Person{
	private int office;
	private double salary;
	
	public Employee(String name, String address, String phoneNo, String email, int office, double salary) {
		super(name, address, phoneNo, email);
		this.office = office;
		this.salary = salary;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", office=" + office + ", salary=" + salary;
	}
	
	
	
}
