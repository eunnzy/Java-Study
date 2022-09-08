package p02.superclass_constructor2;

/*
	1. super & this
	   - super : heap memory에 있는 Parent class의 instance
		 => 자식에서 쓸 수 있음.
	   -this : heap memory에 있는 자기 자신의 instance
	2. super(homePhoneNumber) :
		- 부모 생성자 호출 (본인의 다른 생성자 this (...); )
*/
public class Child extends Parent{
	
	public Child() {
		System.out.println("Child - default constructor 호출");
	}
	
	public Child(int homePhoneNumber) {
//		this.homePhoneNumber = homePhoneNumber;
		super(homePhoneNumber);
		System.out.println("Child(int homePhoneNumber) constructor 호출");
	}
	
	public void printParentInformation() {
		super.name = "홍아버지";
		super.age = 55;
		System.out.println("Parent 이름 : " + name + ", Parent 나이 : " + age);
		super.dummyParent();
	}
}
