package p05.hashmap;

import java.util.*;

/*
	map에 entry 추가
	1. put() 메소드 사용
	2. key가 중복 되더라도 error 발생하지 않음, value값은 최종적으로 저장한 value 값이 됨.
*/

public class HashMapEx2 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		map.put("홍길동", 75);		// 홍길동은 key값이 중복되지만 마지막으로 75를 넣어줬으므로 홍길동을 갖는 key값의 value값을 75로 변경
			
		System.out.println("총 entry 수 : " + map.size());
		System.out.println("홍길동 점수 : " + map.get("홍길동"));
		System.out.println();
	
		map.remove("신용권");
		
		/*
		 	map 원소 검색 첫번째 방법(Iterator 사용)
		 */
		Set<String> keySet = map.keySet();
		Iterator<String> keyIt = keySet.iterator();
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			System.out.println("Key : "+ key + ", Value : " + value);
		}
		System.out.println();
		
		/*
			map 원소 검색 두번째 방법 (향상된 for문 사용)
		 */
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("Key : "+ key + ", Value : " + value);
		}
		System.out.println();
		
		/*
			map 원소 검색 세번째 방법 (entrySet을 통한 key, value를 가져오는 방법)
		 */
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = map.get(key);
			System.out.println("Key : "+ key + ", Value : " + value);
		}
		System.out.println();
		
		
		/*
			map 원소 검색 네번째 방법 : lambda expression 사용 (java 1.8부터 지원)
			forEach 메소드의 parameter로 람다 익명객체 넘김.
		*/
		map.forEach((key, value) -> { 
			System.out.println("Key : "+ key + ", Value : " + value); 
		});
		
		System.out.println();
		
		map.clear();	// map에 있는 key, value 값을 모두 삭제.
		System.out.println("총 entry 수 : " + map.size());
		
	}
	
}
