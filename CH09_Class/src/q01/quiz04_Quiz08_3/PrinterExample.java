package q01.quiz04_Quiz08_3;

// 교재 연습문제 풀기 16번
public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		// default 생성자는 따로 생성 안해줘도 자동으로 생성됨.
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
