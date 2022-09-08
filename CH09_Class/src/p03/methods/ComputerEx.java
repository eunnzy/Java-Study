package p03.methods;

/*
 	class의 method를 사용하려면 new로 heap memory instance 먼저 생성한 후 사용
 	
*/

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values = {1, 2, 3};
		int sum = myCom.sum1(values);
		System.out.println("sum : " + sum);
		
		sum = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("sum : " + sum);
		
		sum = myCom.sum2(1, 2, 3);
		System.out.println("sum : " + sum);
		
		sum = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("sum : " + sum);
		
		sum = myCom.sum2(values);
		System.out.println("sum : " + sum);
		
		sum = myCom.sum2(new int[] {1, 2, 3, 4, 5});
		System.out.println("sum : " + sum);
		
	}

}
