package p03.runtime_exception_multicatch;

/*
 	Exception 처리 전체 문법
 	- try ~ multi catch ~ finally 
 	- finaly : optional (필수 사항이 아니기 때문에 빼도 상관 없음)
 	   => 의미 : try에서 Exception이 발생하든 안하든지 어떤 상황이라도 무조건 실행하는 절.
 */
public class RuntimeExceptionMultiCatchEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];	// args[0] = null
			data2 = args[1];	// args[1] = null
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			Class cls = Class.forName("java.lang.String2");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 변수의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("eclipse Run - Run Cofiguration 메뉴 들어가서 num1, num2 입력하세요.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch (ClassNotFoundException e) {
			System.out.println("compile time 관련 exception 에러 처리");
		}finally {
			System.out.println("숫자 덧셈 연산 처리 프로그램이 종료되었습니다.");
		}
		
		
	}

}
