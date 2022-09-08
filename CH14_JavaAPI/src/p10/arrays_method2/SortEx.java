package p10.arrays_method2;

import java.util.Arrays;

/*
	Arrays.sort(parameter : sorting할 array)
	1. sorting할 array의 data type
	  - int[], char[], long[], double[] 등의 primitive array는 그대로 사용가능.
	  - class로 지정된 array는 (String[], Member[]) Comparable interface를 implement 해야지만 사용 가능
	2. a.compareTo(b)의 return 값이 양의 정수, 0, 음의 정수 3가지 중 하나로 return
	  - Arrays.sort()가 (오름차순으로 정렬) 동작하게 만드는 방식은 
	   * a < b 이면,  음수를 return하고 Arrays.sort()가 a, b의 순서를 그대로 유지
	   * a == b 이면, 0을 return하고 Arrays.sort()가 a, b의 순서를 그대로 유지
	   * a > b 이면, 양수를 return 하고 Arrays.sort()가 a, b의 순서를 b, a로 바꿈
   	  - Arrays.sort()가 (내림차순으로 정렬) 동작하게 만드는 방식은 
	   * a < b 이면,  음수를 return하고 Arrays.sort()가 a, b의 순서를 b, a로 바꿈
	   * a == b 이면, 0을 return하고 Arrays.sort()가 a, b의 순서를 그대로 유지
	   * a > b 이면, 양수를 return 하고 Arrays.sort()가 a, b의 순서를 그대로 유지.
	
	=> Arrays.sort()에서 a.compareTo(b) 의 연산 결과가 양수이면 a, b 순서를 바꿈
*/
public class SortEx {

	public static void main(String[] args) {
		int[] scores = {99, 95, 44, 97, 98};
		
		
		printScoresInfo(scores);
		Arrays.sort(scores);
		printScoresInfo(scores);
		System.out.println();
		
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		printNames(names);
		System.out.println();
		
		
		Member[] members = {new Member("홍길동"), new Member("박동수"), new Member("김민수") };
		Arrays.sort(members);
		printMembers(members);
		
	}
	
	public static void printScoresInfo(int[] scores) {
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	public static void printNames(String[] names) {
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}

	public static void printMembers(Member[] members) {
		for(int i=0; i<members.length; i++) {
			System.out.print(members[i].name + " ");
		}
		System.out.println();
	}

}
