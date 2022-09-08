package p10.annotation;


public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 method 1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 method 2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 method 3");
	}
	
	
}
