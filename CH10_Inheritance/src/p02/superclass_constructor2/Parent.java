package p02.superclass_constructor2;

/*
 	부모 default constructor를 가급적 없애지 말것. (반드시 있는 것을 권장함)
 	- 이유 : 자식 class에서 부모 default constructor를 부르지 않게 코딩 가능하지만,
 		    나중에 자식 class에서 새로운 constructor를 만드는 등 확장성을 고려하는 것이 필요.
*/
public class Parent {
	int homePhoneNumber;
	String name;
	int age;
	
	
	public Parent() {
		System.out.println("Parent - default constructor 호출");
	}
	
	public Parent(int homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
		System.out.println("Parent(int homePhoneNumber) constructor 호출");
	}
	
	public void dummyParent() {
		System.out.println("parent dummy method");
	}
	
	
}
