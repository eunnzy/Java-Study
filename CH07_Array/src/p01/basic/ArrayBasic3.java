package p01.basic;

import java.util.Scanner;

/*
 	console에서 배열크기와 각 배열 원소의 값을 읽어 오기
 	
*/

public class ArrayBasic3 {

	public static void main(String[] args) {
		double[] myList;
		
		Scanner input = new Scanner(System.in);
		System.out.println("배열 전체 크기를 입력하세요.");
		int arrayLength = input.nextInt();
		
		myList = new double[arrayLength];
		
		for(int i=0; i<myList.length; i++) {
			System.out.println((i+1) + "번 째 원소를 입력하세요.");
			myList[i] = input.nextDouble();
		}
		
		for(int i=0; i<myList.length; i++) {
			System.out.println("myList[" + i + "] : " + myList[i]);
		}
	
		
	}

}
