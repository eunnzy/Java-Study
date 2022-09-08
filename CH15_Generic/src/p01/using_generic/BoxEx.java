package p01.using_generic;

/*
 	Box<String> : data type (T가 String이라는 의미)
 	 => JVM이 실행할 때 Box<String>에 대한 class를 만들어 놓음
 	 => Box<Apple>, Box<Integer>도 JVM이 실행할 때 별도로 class를 만들어 놓음.
 	단점 : class가 메모리에 여러개 만들어짐.
 	1. compile 할 때, data type이 결정되어, 어떠한 data type을 사용하더라도 casting 없이 사용이 가능함.
	2. generic type은 class 뿐만 아니라, Interface에서도 사용이 가능, method에서도 사용 가능.
*/

public class BoxEx {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setT("hello");
		String str = b1.getT();
		
		Box<Apple> a1 = new Box<Apple>();
		a1.setT(new Apple());
		Apple apple = a1.getT();
		
		Box<Integer> i1 = new Box<Integer>();
		i1.setT(new Integer(10));
		Integer ii = i1.getT();
	}

}
