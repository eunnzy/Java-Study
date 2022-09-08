package p07.singleton_usage;

/*
	1. Constructor를 private으로 선언 : class 밖에서 new로 인스턴스를 만드는 것을 막음
	2. class내에서 field 선언을 할 때 본인 class type으로 선언 가능하고, 인스턴스 생성할 수도 있음.
	3. singleton 의미: instance를 class내에서 1번만 생성하고, 다른 class에서는 new로
					 인스턴스 새로 만들 필요 없이 생성된 인스턴스를 사용하게 하려는 의도가 있음.
*/
public class Singleton {
	// 자기자신의 class에 대한 field 선언하고 인스턴스 생성.
	private static Singleton singleton = new Singleton();
	
	private Singleton() { 
		
	}

	public static Singleton getInstance() {
		return singleton;
	}

	public void printSingletonHello() {
		System.out.println("Hello, singleton instance method");
	}
	
	

}
