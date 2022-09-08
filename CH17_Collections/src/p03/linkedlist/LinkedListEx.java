package p03.linkedlist;

import java.util.*;

/*
 	1. LinkedList는 원소가 빈번히 추가, 삭제되는 application에 사용하는 것을 권장.
 		- ex: 증권 주식 주문 (증권 어플리케이션)
 	2. ArrayList는 원소가 빈번히 추가, 삭제되면 속도가 느려지는 단점이 있음.
 		- 주로, 원소 생성 후 조회가 많은 application에서 사용하는 것을 권장 (박물관 시스템, 고고학 시스템)
 		- vector 보다는 ArrayList가 처리속도가 일반적으로 빨라 ArrayList 많이 사용
 		
 	데이터들이 저장되는 형태가 내부적으로 ArrayList와 다름. 
 	데이터 작업을 할 때 새로 추가, 삭제, 조회, 수정 등을 할 때, LikedList는 데이터를 추가할 때 시간이 많이 들지 않음.
 */

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// Integer -> String으로 변환하여 list에 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns");
	}

}
