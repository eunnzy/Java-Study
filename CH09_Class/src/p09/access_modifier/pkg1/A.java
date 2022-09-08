package p09.access_modifier.pkg1;

/*
  	1. public :  같은 package, 다른 package 모두 사용 가능
  	2. default : 같은 package내에서만 사용 가능(다른 package 사용 불가능)
  		- 사용 의미 : 같은 package (전체 application에서 같은 기능을 구현하는 클래스들만 사용하겠다는 의미)
 		 => 다른 말로 하면, 같은 기능을 구현하는 개발자들끼리 공유해서 사용할 경우에 사용
  	3. private: class 내부에서만 사용 가능
*/
public class A {
	int a = 10;				// default (access modifier) field
	public int b = 20;		// public field
	private double c = 30;		// private field
	
	// default constructor
	A() { 
		
	}
	
	public A (int b) {
		this.b = b;
	}
	
	private A (double c) {
		this.c = c;
	}

	public void printPublic() {
		System.out.println("public method");
	}
	
	void printDefault() {
		System.out.println("default method");
	}
	
	private void printPrivate() {
		System.out.println("private method");
	}
	
	
}
