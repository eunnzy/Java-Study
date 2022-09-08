package p05.restricted_generic;

public class Course<T> {
	private String name;
	private T[] students;
	double a;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];		// new로 인스턴스를 만들면 모든 참조타입의 field는 null로 setting.
//		this.students = new T[capacity]; 	 => 이렇게 쓰는 것이 원칙이지만 자바에서는 이렇게 쓰는 것이 불가능임.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
