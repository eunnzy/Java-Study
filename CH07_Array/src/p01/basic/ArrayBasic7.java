package p01.basic;

/*
	배열 원소 중 최대값 구하기
*/
public class ArrayBasic7 {

	public static void main(String[] args) {
		double[] myList = new double[10];
		
		for(int i=0; i<myList.length; i++) {
			myList[i] = Math.random()*100;
		}
		
		for(double element : myList) {
			System.out.println(element);
		}	
		
		double max = myList[0];			// 첫 원소를 max라고 가정.
		for(int i=1; i<myList.length; i++) {
			if(myList[i] > max ) {		// 배열 원소에 있는 값이 가정한 max보다 크면 (i를 하나씩 증가시키면서 비교해 줌.)
				max = myList[i];		// 그 값을 max로 지정
			}		
		}
		
		System.out.println("max : " + max);
		
	}

}
