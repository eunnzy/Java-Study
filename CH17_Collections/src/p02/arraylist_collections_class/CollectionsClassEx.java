package p02.arraylist_collections_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
	Collections method 설명
	1. max() : 원소 중에 최대값 구하는 메소드
	2. min() : 원소 중에 최소값 구하는 메소드
	3. binarySearch() : 원하는 원소를 찾아 index return (binary search algorithm 사용하여 검색 속도가 매우 빠름)
	4. sort() : 오름차순 정렬
	5. reverse() : list 순서 뒤집기
	6. disjoint() : 두개의 list의 원소들 간에 하나라도 중복되지 않으면 true, 하나라도 중복되면 false return
*/

public class CollectionsClassEx {

	public static void main(String[] args) {
		Integer[] numbers = {1123, 1412, 23, 44, 512132};
		List<Integer> list = Arrays.asList(numbers);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.binarySearch(list, 44));
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		Integer[] numbers1 = {121, 23532, 123, 1, 41234};
		List<Integer> list1 = Arrays.asList(numbers1);
		
		System.out.println(Collections.disjoint(list, list1));
		
	}

}
