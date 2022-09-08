package p06.class_promotion;

/*
   class에서 자동형변환(promotion) 정의
   1. 부모와 자식 class 간에서만 발생.
   2. 자식 인스턴스를 부모 데이터 타입으로 넘길 때 발생되는 현상.
   	- Parent p = new Child();
   3. heap memory 사용관점에서 보면, promotion은 자식 인스턴스가 생성한 지식과 부모 인스턴스 2개 중에서 부모 인스턴스만 사용하겠다는 의미
   4. 자식 인스턴스를 부모 인스턴스로 promotion하면, 부모 클래스에서 선언된 field, method만 사용가능함.
*/
public class StudentEx {

	public static void main(String[] args) {
		Person p;		// 부모 클래스
		Student s = new Student("홍길동");	// 자식 클래스
		s.printPersonInformation();
		s.printStudentInformation();
		
		p = s;		// promotion 발생. (자식 class 인스턴스를 부모 class 인스턴스로 자동 형변환)
		// p = s 대신에 다음과 같이 작성할 수 있음
		p = new Student("김길동"); 	
		p.printPersonInformation();		
//		p.printStudentInformation();	// 불가능함. => p에서는 자식 인스턴스의 method 사용 불가함.
		
	}

}
