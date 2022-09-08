package p01.netsed_class;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
//		instance member class 인스턴스 생성
		A.B b = a.new B();		//		A 클래스 안에 있는 B 클래스의 인스턴스 생성.
		b.field1 = 3;
		b.method1();
		
//		static member class instance 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 5;
		c.method2();
		
//		A의 local method 실행
		a.method();
		
	}

}
