package p07.class_casting;

public class Student extends Person{
	String grade;
	String dept;
	
	public Student(String name) {
		super(name);
	}
	
	public void printStudentInformation() {
		System.out.println("Student class - method 실행");
	}
	
}
