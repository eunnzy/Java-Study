package p01.practice;

//	학생 성적 매기기 (문제 수 : 10문제)
public class GradeExam {

	public static void main(String[] args) {
		char[][] studentAnswers = {
					{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },	// 첫번째 학생이 제출한 정답.
					{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },	// 두번째 학생이 제출한 정답.
					{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },	// 세번째 학생이 제출한 정답.
					{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },	// 네번째 학생이 제출한 정답.
					{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }	// 다섯번째 학생이 제출한 정답.
							};
		
		char[] answers = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		
		
		for(int i=0; i<studentAnswers.length; i++) {
			int correctCount = 0;
			for(int j=0; j<studentAnswers[i].length; j++) {
				if(studentAnswers[i][j] == answers[j]) {
					correctCount++;
				}
			}
			System.out.println("학생 번호 " + (i+1) + "의 정답 총 개수: " + correctCount);
		}
		
	}

}
