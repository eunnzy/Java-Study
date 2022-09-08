package p02.object_class_tostring;

import java.util.Date;

/*
	println(obj) 메소드는 내부적으로 obj가 class의 인스턴스라면, obj.toString() 실행
	1. Object class의 toString() method 실행결과
	  - package명 + class 이름 + @ + 힙메모리주소
	2. String, Date class는 Object class의 toString() method를 override하여 customizing
*/
public class ToStringEx {

	public static void main(String[] args) {
		Object obj = new Object();
		String name = "홍길동";
		Date date = new Date();
		
		System.out.println(System.identityHashCode(obj));			// 힙메모리주소 출력값 : 10진수로 출력
		System.out.println(System.identityHashCode(obj.toString()));
		
		System.out.println(obj.toString());	// toString 메소드는 16진수로 출력.
		System.out.println(obj);		// obj.toString() 메소드 실행
		
		System.out.println(name.toString());
		System.out.println(name);
		
		System.out.println(date.toString());
		System.out.println(date);
		
		
	}

}
