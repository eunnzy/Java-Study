package p02.superclass_constructor4;

/*
   	모든 class의 부모 class는 Object class.
 	 - 모든 class를 new로 인스턴스 만들 때, heap memory에 instance가 생성되기 전에 
 	   Object class의 인스턴스가 먼저 생성됨
 	 - 부모가 Object class인 경우는 생략이 가능 (Java가 자동으로 인스턴스를 만들어 줌)
 	 - Object class는 default constructor 밖에 존재하지 않음.
 */
public class People extends Object{
	public String name;
	public String ssn;
	
	public People() {
		System.out.println("parent - default constructor");
	}
	
	public People(String name, String ssn) {
		super(); 		// Object class의 default constructor 호출
//		this();			// 본인 class의 다른 생성자 호출 가능
		this.name = name;
		this.ssn = ssn;
	}

	
	
	
}
