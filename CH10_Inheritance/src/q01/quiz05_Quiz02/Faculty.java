package q01.quiz05_Quiz02;

public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phoneNo, String email, int office, double salary, String officeHours, String rank) {
		super(name, address, phoneNo, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + ",officeHours=" + officeHours + ", rank=" + rank;
	}
	
	
	
}
