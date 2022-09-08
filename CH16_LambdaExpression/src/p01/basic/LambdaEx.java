package p01.basic;

/*
	Lambda Expression 정의 
	1. Interface의 추상메소드로만 사용 가능
	2. Interface의 추상메소드가 1개만 있을 경우만 사용 가능
	3. Lambda expression(람다표현식)으로 생성된 instance는 내부적으로 interface를 자식 익명 객체로 만든 것과 동일함. 
	4. Lambda expression 예
	 * () -> { 	System.out.println("Hello, Lambda function MyInterface Instance");  };
	  => sayHello() 추상메소드를 구현한 것을 표현
	 * () 람다식 괄호의 의미  : method parameter list를 의미함.
	 * { System.out.println("Hello, Lambda function MyInterface Instance"); }; 의 의미 : sayHello()의 메소드의 body를 coding
*/
public class LambdaEx {

	public static void main(String[] args) {
		MyInterfaceImpl mi = new MyInterfaceImpl();
		mi.sayHello();
		
		// 인터페이스를 익명객체로 생성하여 사용
		MyInterface ma = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello, Anonymous MyInterface Instance");
			}
		};
		
		ma.sayHello();
		
		// Lambda 표기법
		MyInterface ml = () -> {
			System.out.println("Hello, Lamda function MyInterface Instance");
		};
		ml.sayHello();
		
	}

}
