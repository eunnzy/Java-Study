package p02.superclass_constructor;

public class ConstructorEx {

	public static void main(String[] args) {
		/*
		 	상속 생성자 호출 순서 
		  	1. JVM에서 heap memory에 부모 인스턴스 생성
		  	2. JVM에서 heap memory에 자식 인스턴스 생성
		  	3. 부모 class인 Parent class의 default constructor 호출.
		  	4. 자식 class인 Child class의 default constructor 호출.
		*/
		Child c = new Child();
		
		System.out.println();
		
		/*
		 	상속 생성자 호출 순서 
		  	1. JVM에서 heap memory에 부모 인스턴스 생성
		  	2. JVM에서 heap memory에 자식 인스턴스 생성
		  	3. 부모 class인 Parent class의 default constructor 호출.
		  	4. 자식 class인 Child class의 Child(int homePhoneNumber) constructor 호출.
		 */
		
		Child c2 = new Child(11);
		
		
		
		
	}

}
