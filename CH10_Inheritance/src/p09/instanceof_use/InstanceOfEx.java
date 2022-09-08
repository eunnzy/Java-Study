package p09.instanceof_use;

class Parent {}
class Child extends Parent{}

/*
   	method2() coding방식으로 하지 말고, method1() 방식으로 coding할 것
	=> class casting (강제형변환)할 때 반드시 instanceof를 사용하여 강제형변환 가능한지 먼저 check할 것
	
*/
public class InstanceOfEx {

	public static void main(String[] args) {
		Parent pa = new Child();
		method1(pa);
		method2(pa);
		
		Parent pb = new Parent();
		method1(pb);
		method2(pb);
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;		// casting
			System.out.println("method1 - Child 인스턴스로 변환 성공");
		} else {
			System.out.println("method1 - Child 인스턴스로 변환할 수 없습니다.");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 인스턴스로 변환 성공");
	}

}
