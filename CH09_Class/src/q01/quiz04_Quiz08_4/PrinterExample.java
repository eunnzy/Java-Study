package q01.quiz04_Quiz08_4;

// 교재 연습문제 풀기 17번
/*
	  Printer 객체를 생성하지 않고 println메소드를 다음과 같이 호출하기 위해서
	  Printer class에서 선언한 메소드 앞에 static을 붙여주면 객체 생성 없이 메소드 호출이 가능하다.
*/
public class PrinterExample {

	public static void main(String[] args) {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
