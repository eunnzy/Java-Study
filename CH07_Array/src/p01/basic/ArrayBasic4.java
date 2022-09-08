package p01.basic;

/*
 	배열 원소의 초기값을 0 ~ 100이내의  실수값으로 random하게 주는 프로그램
*/
public class ArrayBasic4 {

	public static void main(String[] args) {
		double[] myList = new double[10];
		
		for(int i=0; i<myList.length; i++) {
			myList[i] = Math.random()*100;
		}
		
		for(double element : myList) {
			System.out.println(element);
		}
		
	}

}
