package q01.quiz01;

public class Quiz07_4 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 한명 당 연필을 가지려면 인원 수 대로 나눠서 몫의 값 산출
		int pencilsPerStudent = 534 / 30;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필의 수 산출을 위해 나머지 연산
		int pencilsLeft = 534 % 30;
		System.err.println(pencilsLeft);
	}

}
