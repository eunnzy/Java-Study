package p04.nan_infinity;

/*
	1. Infinity: 무한대, 특히 분모를 0으로 나눌 경우.
	2. NaN : Not a Number
	3. 
*/

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z;
		
		// z = x / y;	// 출력결과: Infinity(무한대)
		z = x % y;		// 출력결과: NaN
		System.out.println("z = " + z);  


		if( (Double.isInfinite(z)) || (Double.isNaN(z)) ) {
			System.out.println("z의 값을 산출할 수 없습니다.");
		}else {
			z = z + 2;
		}
		
		
	}

}
