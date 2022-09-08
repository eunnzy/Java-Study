package p04.hashset2;

import java.util.*;

/*
	Object class의 toString method 출력값
	 - package이름 + class 이름 + @ + 힙메모리 주소 (hashCode값)
	 => hash code값은 hashCode()의 return값과 동일
*/

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		String name1 = "김길동";
		String name2 = "김길동";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println("m1의 hashCode 리턴값 : " + m1.hashCode());
		System.out.println("m2의 hashCode 리턴값 : " + m2.hashCode());
		System.out.println(m1);
		System.out.println(m2);
		
		
		set.add(m1);
		set.add(m2);	// hash function 결과값이 hash code 값이 동일하고 equals가 true이면 중복 저장 안함.
		
		System.out.println("총 원소수 : " + set.size());	// m1과 m2가 중복 => 1이 출력됨.
		
	}

}
