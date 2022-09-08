package p01.object_class_equals;

/*
 	1. Object class의 equals method 동작 방식
 	  => '==' 연산자(operator)와 같은 결과를 도출.
 	  - obj1 == object의 결과가 false가 나와서 obj1.eqauls(obj2)의 결과도 false가 나옴.
 	2. String class의 equals method 존재.
 	  - Object class의 equals method를 override 시켜 새로 코딩함.
 	  - 문자열 내용이 같으면 true가 나오도록 코딩함.
 */
public class ObjectEqualsEx {

	public static void main(String[] args) {
		 Object obj1 = new Object();
		 Object obj2 = new Object();
		 String name1 = new String("홍길동");
		 String name2 = new String("홍길동");
		 String name3 = "홍길동";		// String literal인 경우에는 자바가 heap memory에 1개만 만들어 놓음.
		 String name4 = "홍길동";
		 int x = 10;
		 int y = 10;
		 
		 // obj1, obj2의 힙메모리의 시작 주소 값 출력
		 System.out.println(System.identityHashCode(obj1));
		 System.out.println(System.identityHashCode(obj2));
		 
		 boolean result = obj1.equals(obj2);
		 System.out.println("result : " + result);
		 
		 result = (obj1 == obj2);	// heap memory의 주소값을 비교.
		 System.out.println("result : " + result);
		 
		 result = (x == y);		// 값을 비교
		 System.out.println("result : " + result);
		 
		 result = (name1 == name2);		// 힙메모리 비교
		 System.out.println("result : " + result);
		 
		 result = (name1.equals(name2));		// 값을 비교
		 System.out.println("result : " + result);
		 
		 result = (name3 == name4);		// 힙메모리 비교
		 System.out.println("result : " + result);
		 
		 result = (name3.equals(name4));		// 값을 비교
		 System.out.println("result : " + result);
	}

}
