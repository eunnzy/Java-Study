package p02.compile_exception;

/*
  	Compile Exception 처리 방법
  	- 프로그램 소스 코드 안에 강제적으로 try ~ catch 문법을 만들어서 사용해야만 함.
	
 */
public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		
		try {
			// cls : java.lang.String class의 field, constructor, method 관련 정보를 갖고 있는 인스턴스
			// forName method에서 parameter로 넘겨온 class가 없으면, ClassNotFoundException instance 발생
			Class cls = Class.forName("java.lang.String");
			System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {		// 클래스가 존재하지 않으면
			System.out.println("클래스가 존재하지 않습니다.");		// 화면에 출력.
			
		}
		
	}

}
