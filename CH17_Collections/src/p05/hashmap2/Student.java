package p05.hashmap2;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return ( (this.sno == student.sno) && (this.name.equals(student.name)) );
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
	
}
