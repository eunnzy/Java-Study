package p01.basic5;

/*
	new Student()를 실행할 때, Student class의 field들은 다음과 같이 초기화가 됨.
	1. int, short, byte, char, long은 0으로 초기화가 됨.
	2. boolean은 false로 초기화
	3. flaot, double은 0.0으로 초기화
	4. String, 배열 등 참조객체 type은 null로 초기화
*/
public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		
		
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.age);
		System.out.println("컴퓨터 전공 : " + student.isComputerMajor);
		System.out.println("성별 : " + student.gender);
	}

}
