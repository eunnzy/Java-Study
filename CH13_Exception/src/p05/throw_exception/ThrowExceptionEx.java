package p05.throw_exception;

/*
 	main method에서 Throw Exception을 사용한 경우
 	1. JVM이 main에서 넘긴 Exception을 실행함.
 		=> user friendly하지 않아 비추천
 	2. 절대로 main method에서 throws 사용하지 말 것.
*/

public class ThrowExceptionEx {

	public static void main(String[] args) throws ClassNotFoundException {
		
		findClass();
		System.out.println("정상 처리됨.");
	}
	
	/*
	    method 선언문에서 throws ClassNotFoundException 의미 : 
	 	 => method 내부에서 ClassNotFoundException이 발생이 되면, method를 호출한 method로 Exception을 넘김 (throw)
	*/
	 
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}

}
