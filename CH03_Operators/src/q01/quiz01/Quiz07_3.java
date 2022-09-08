package q01.quiz01;

public class Quiz07_3 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		/*
		 	(!(85 > 90 )) ? "가" : "나"
			(!(false)) ? "가" : "나"
			true -> "가" 반환
		*/
		System.out.println(result);
	}

}
