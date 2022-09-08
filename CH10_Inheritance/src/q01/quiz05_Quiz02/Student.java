package q01.quiz05_Quiz02;

public class Student extends Person{
	private int status;
	static final int FRESHMAN = 1;
	static final int SOPHOMORE = 2;
	static final int JUNIOR = 3;
	static final int SENIOR	= 4;
	
	public Student(String name, String address, String phoneNo, String email, int status) {
		super(name, address, phoneNo, email);
		this.status = status;
	}

	// status case지정하여 문자열로 리턴
	public String getStatus() {
		switch(this.status) {
		case 1:
			return "FRESHMAN";
		case 2:
			return "SOPHOMORE";
		case 3:
			return "JUNIOR";
		case 4:
			return "SENIOR";
		default :
			return "찾을 수 없습니다.";
		}
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString()+ ", status=" + status;
	}
	
	
	
}
