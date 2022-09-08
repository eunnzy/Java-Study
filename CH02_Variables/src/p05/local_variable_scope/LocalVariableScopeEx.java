package p05.local_variable_scope;

/*
 	변수(variable)의 생명주기 (life cycle) : 변수가 생성되고 사용되고 소멸되는 과정
 	1. 변수의 생명(존재) 유지하는 것은 메모리에 있을 경우에만 가능
 		- 변수가 메모리에 존재해야지만, 변수의 메모리 값을 읽고, 메모리 값을 수정할 수 있음.
 	2. Java에서 변수의 생명 주기는 { } (블록) 안 에서만 살아 있음.
 		- 예를 들면, parentNum 변수는 main 메소드 안에서만 살아 있음.
 		- childNum 변수는 if문 블록 안에서만 살아 있음
 		
 	
*/
public class LocalVariableScopeEx {

	public static void main(String[] args) {
		int parentNum = 20;		

		if(parentNum > 10) {
			int childNum = parentNum - 10;  // 지역변수로 if문 내에서만 존재한다.
			System.out.println("parentNum = " + parentNum);
			System.out.println("childNum = " + childNum);
		}	// childNum 변수 생명 끝남.
		
		System.out.println("parentNum = " + parentNum);	
//		System.out.println("childNum = " + childNum);
		// childNum 변수는 if문 내에서만 존재하므로 if문 밖에서 사용시 error 발생.

		{
			// a 변수는 이 블록 안에서만 사용가능!!
			int a = 20;
			System.out.println("a = " + a);
		}
		
	}		// parentNum의 생명 끝남.
	
//	parentNum = 30;
	// parentNum은 main 안에서만 존재하기 때문에 main 이외의 블록에서 사용시 error 발생

}
