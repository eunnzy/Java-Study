package p05.throw_exception;

/*
 	Throw Exception 처리 방법
 	1. 원칙 : Exception이 발생한 method에서 try ~ catch를 사용하여 Exception 처리하는 것이 원칙임.
 	2. Exception이 발생한 method를 호출하는 상위 method에서 처리하도록 하는 방법이 존재
 	  - 하위 메소드에서 throws ClassNotFoundException 같은 Exception을 선언 가능.
 	  - 상위 메소드에서는 모든 종류의 exception들을 한번에 처리할 경우에 사용함.
 */

public class ThrowExceptionEx2 {

	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("정상 처리됨.");
		} catch (ClassNotFoundException e) {
			System.out.println("compile-time Exception 발생");
		}
	}
	
	/*
	    method 선언문에서 throws ClassNotFoundException 의미 : 
	 	 => method 내부에서 ClassNotFoundException이 발생이 되면, method를 호출한 method로 Exception을 넘김 (throw)
	 */
	 
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}

}
