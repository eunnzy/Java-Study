package p01.vector_ex;

import java.util.*;

/*
 	List data type의 특징
 	1. 원소 추가할 때 기본적으로 맨 마지막 원소 다음에 넣음.
 	2. 원소 삭제하면, 해당 원소의 자리에 다음에 있는 원소가 하나씩 땡겨서 중간에 비어있는 자리가 없음.
	Vector<E> E (Element의 data type)
	
*/
public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();		// == int[] v
//		List<Integer> v = new Vector<Integer>();		// promotion 발생
		
		
		v.add(5);	// add는 항상 마지막 원소 다음에 집어 넣음.
		v.add(4);
		v.add(-1);
		
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);		// v.get(i) == v[i]
			System.out.println(n);
		}
		System.out.println();
		
		v.add(1, 100); 	// 1번째 원소에 100을 추가 (index 1 위치에 100의 값을 끼워넣기)
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);		// v.get(i) == v[i]
			System.out.println(n);
		}
		
		System.out.println("전체 원소의 개수 : " + v.size());
		System.out.println("vector 전체 크기 : " + v.capacity());
/*
 		capacity() : vector가 담을 수 있는 현재 최대 원소 개수 
		vector의 원소의 개수가 capacity()만큼 찼으면 자동적으로 capacity()를 늘려줌.
 */
		
		for(int i=0; i<10; i++) {
			v.add(i+10);
		}
		
		System.out.println("전체 원소의 개수 : " + v.size());
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		
//		collection : 향상된 for문 사용 적극 권장
		for(int i : v) {
			System.out.println("원소 : " + i);
		}
	}

}
