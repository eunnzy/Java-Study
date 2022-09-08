package p02.arraylist;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요.");
			String name = input.next();
			a.add(name);
		}
		
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println("전통 for문 사용 이름 : " + name);
		}
		
		for(String name : a) {
			System.out.println("향상된 for문 사용 이름 : " + name);	
		}
		
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("Iterater 사용 이름 : " + name);
		}
		
		
	}

}
