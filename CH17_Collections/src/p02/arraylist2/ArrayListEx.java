package p02.arraylist2;

import java.util.*;

/*
	List 계열 collection
	1. 원소(element)값이 동일하더라도 중복 저장
	2. index, 원소값으로 삭제 가능
	  - 삭제할 때, 뒤에 있는 원소가 자동으로 삭제된 원소 위치로 이동함.
	  - index로 삭제할 원소가 없으면 IndexOutOfBoudns exception 발생
	  - 원소값으로 삭제할 원소가 없으면 오류 없이 아무런 동작을 하지 않음.
*/

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		list.add("Java");
		list.add("jdbc");
		
		System.out.println("전체 개수 : " + list.size());
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
	}

}
