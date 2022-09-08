package p04.system_class;

/*
 	System class의 exit(int status) method
 	1. 사용 목적 : 프로그램 강제 종료
 	2. exit method에서 status parameter인 status 값 
 	  - status 값이 무엇이든지 간에 프로그램 내부적으로는 의미가 없음.
 	  - 통상적으로 status가 0이면 정상 종료한다는 의미.
 	  - 0이 아닌 다른 정수라면 프로그램이 비정상적으로 종료되었다는 의미 (개별 프로젝트팀 내부에서 의사결정)
 	   (1: Hardware Error, 2: Network Error, 3: DB connection error, ...)
 	  - Java에서 System.exit() 메소드를 통해 status값이 어느 값이 오더라도 프로그램이 강제 종료됨.
 	3. System.setSecuirtyManager 메소드를 통해 status 값이 특정 정수값인 경우만 프로그램이 강제 종료되도록 코딩 가능.
 	  - 방법 : setSecurityManager의 parameter로 SecurityManager class의 익명객체를 parameter로 넘기고
 	         SecurityManager 익명객체의 checkExit()를 override하여 코딩하면 됨.
 	  - 이유 : exit() 메소드를 실행하면 JVM이 시스템을 강제 종료하기 전에 checkExit() 메소드를 자동 실행.
 	4. 이 예제에서 사용한 개념
 	  - 자식 클래스로 익명객체를 생성하여 method의 parameter로 넘김 
 	  - method의 parameter data type이 부모 클래스여서 자식인 익명객체가 부모 클래스로 promotion됨.
 	  - 익명 객체에서 부모 클래스의 method를 override 했기 때문에 부모 instance에서 부모 method를 실행할 때,
 	    override된 익명객체의 method가 실행됨 (polymorphism) 
*/

public class ExitEx {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
			
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			}catch(SecurityException e) {
				System.out.println("Security Exception 호출됨");
			}
		
		}
		
	}

}
