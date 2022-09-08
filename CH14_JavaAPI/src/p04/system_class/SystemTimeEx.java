package p04.system_class;

/*
	System.nanoTime() :
	- 현재 시간을 nano(1/1000000000) second 단위로 환산한 정수값
	  => 1970년 1월 1일 0시 0분 0초 기준으로 계산된 정수값
	- 사용 용도 : 프로그램의 실행 소요 시간 계산
	
	System.currentTimeMills() :
	- 현재 시간을 milli seconds (1/1000) 단위로 환산한 정수값
*/

public class SystemTimeEx {

	public static void main(String[] args) {
//		long startTime = System.nanoTime();
		long startTime = System.currentTimeMillis();
		
		int sum = 0;
		
		for(int i=0; i<1000000; i++) {
			sum += i;
		}
		
//		long endTime = System.nanoTime();
		long endTime = System.currentTimeMillis();
		
		System.out.println("sum : " + sum);
		System.out.println("1~백만 숫자 합계 소요 시간: " + (endTime-startTime));
		
		
	}

}
