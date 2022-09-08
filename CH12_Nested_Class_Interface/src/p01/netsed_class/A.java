package p01.netsed_class;

public class A {
	int f1;
	static int f2;
	
	public A() {
		System.out.println("A 인스턴스 생성");
	}	
	
	// instance member class
	class B {
		int field1;
//		static int field2;		// instance member class에서 static field 선언 불가능.
		
		
		public B() {
			System.out.println("B instance member class 인스턴스 생성");
		}

		
		void method1() {
			System.out.println("B class field1 : " + field1);
		}
//		static void method2() {}	// static method 선언 불가능
		
	}
	
	
//	static member class
	static class C {
		int field1;
		static int field2;
		
		public C() {
			System.out.println("C static member class 인스턴스 생성");
		}
		
		void method1() {
			System.out.println("C class(method1) field1 : " + field1);
		}
		static void method2() {
			System.out.println("C class(method2) field2 : " + field2);
		}
		
	}
	
//	class A의 instance method
	void method() {
		int f1;	// local variable(method 안에 선언된 변수)
//		static final int f2=0;
		
		
		class D {		// class D : local class (method 안에 선언된 class를 의미 : 
			int field1;
//			static int field2;
			
			public D() {
				System.out.println("D member class 인스턴스 생성");
			}
			
			void method1() {
				System.out.println("local class field1 : " + field1);
			}
//			static void method2() {}
		}	// class D는 method()가 끝나면 사용이 불가함.
				
		
		/*
		  	method 내에서 선언된 local class를 사용할 수 있는 곳은 method 내부에서만 가능
		  	method 내부에서 new로 인스턴스 생성해서 사용해야만 함.
		*/
		D d = new D(); 
		d.field1 = 3;
		d.method1();
	}
	
}
