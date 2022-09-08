package q01.quiz05_Quiz02;

public class Staff extends Employee{
	private String title;
	
	public Staff(String name, String address, String phoneNo, String email, int office, double salary, String title) {
		super(name, address, phoneNo, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + ", title=" + title;
	}

	
	
	
}
