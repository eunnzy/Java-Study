package p03.methods;

/*
	class내에서 메소드가 다른 메소드를 직접 호출하여 사용할 수 있음
	 => this. 을 붙여서 사용 가능.
*/

public class Computer {
	int sum;
	
	public int sum1(int[] values) {
//		this.sum = 0;
		this.beforeNotice();
		
		for(int i=0; i<values.length; i++) {
			this.sum += values[i];
		}
		
		return this.sum;
	}
	
	public int sum2(int... values) {
//		this.sum = 0;
		this.beforeNotice();
		
		for(int i=0; i<values.length; i++) {
			this.sum += values[i];
		}
		
		return this.sum;
	}
	
	public void beforeNotice() {
		this.sum = 0;
		System.out.println("합계 계산을 시작합니다.");
	}
	
}
