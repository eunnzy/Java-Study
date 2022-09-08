package p04.hashset;

import java.util.*;

/*
	set : 중복된 원소를 저장하지 않음
	- 모든 원소가 중복되지 않아야 하는 application에서 사용
*/

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// 중복값 삽입 => x
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총원소수 : " + size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		System.out.println();
		
		for(String e : set) {
			System.out.println(e);
		}
		
	}
}
