package p01.basic;

/*
	자식(child) class : Student, 부모(parent) class : Person
	자식 class는 부모 class의 field, method 모두 사용 가능한 것이 원칙
	 - 단, 부모의 생성자는 자식이 물려받을 수 없음.
*/
public class Student extends Person{
	String ssn = "123456"; 		// 학생 번호
	
	void study() {
		System.out.println(name + "는 공부합니다");
	}
	
	
}
