package q01.quiz02;

import java.util.*;

// 학생수 입력 받고 학생수만큼 점수 입력하고 학생들 중 최고점수 찾기
public class Quiz08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("전체 학생 수를 입력하세요: ");
		int num = input.nextInt();
		
		ArrayList<Integer> students = new ArrayList<>();		// 정수형 ArrayList 생성
		
		for(int i=0; i<num; i++) {			// 입력받은 학생 수 만큼 반복문 실행하여 학생들의 성적을 받아옴
			System.out.print( (i+1) +"번 째 학생의 성적을 입력하세요 : ");
			int score = input.nextInt();		// 점수를 입력 받고
			students.add(score);		// ArrayList에 삽입.
			
		}
		// 첫번째 학생의 점수를 가장 큰 점수라고 가정.
		int max = students.get(0);
		
		for(int i=1; i<num; i++) {		// 0번째 점수 값을 최고점수라고 가정 했으므로 1번째 점수값부터 가정한 값과 비교
			if(max < students.get(i))	// 가정한 값보다 비교하는 값이 크면
				max = students.get(i);	// max값을 비교하는 값으로 바꿔준다.
		}
		
		System.out.println("최고 성적값은 " + max + "입니다.");
	}

}
