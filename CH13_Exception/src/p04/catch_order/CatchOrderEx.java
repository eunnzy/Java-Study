package p04.catch_order;

/*
	Exception multi catch 처리 방법
	1. catch 순서가 매우 중요함
	  - catch에서 최상위 부모 class인 Exception이 맨처음에 나오면 뒤에 나오는 catch문의 Exception block이 처리 안됨.
	    => 이유: promotion(자동형변환)이 발생함.
	2. 최상위 부모 class인 Exception은 multi-catch block의 맨마지막에 넣는 것이 원칙임.
	    => 의미: 앞 부분에 나타난 특정 Exception class들을 처리하고, 맨마지막에 나머지 모든 Exception을 처리.
	 
*/
public class CatchOrderEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			// ArrayIndexOutOfBoundsException발생
			data1 = args[0];	// args[0] = null
			data2 = args[1];	// args[1] = null
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			Class cls = Class.forName("java.lang.String");
	
		}
//		catch(Exception e) {	
//		/*
//		 	Exception class는 모든 RuntimeException, Compile 관련 Exception 모두의 부모.
//		 	 => promotion 발생함.
//		 	모든 Exception 수행되는 문제 발생.
//		*/
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 변수의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("eclipse Run - Run Cofiguration 메뉴 들어가서 num1, num2 입력하세요.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch (ClassNotFoundException e) {
			System.out.println("compile time 관련 exception 에러 처리");
		}catch (Exception e) {	// Exception의 최후의 보류
			System.out.println("위에 언급한 Exception 이외의 Exception이 발생되었습니다.");
		}finally {
			System.out.println("숫자 덧셈 연산 처리 프로그램이 종료되었습니다.");
		}
		
		
	}

}
