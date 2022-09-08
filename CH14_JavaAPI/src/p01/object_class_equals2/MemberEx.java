package p01.object_class_equals2;

/*
	1. Member class : 사용자가 정의한 클래스
	2. 동일한 멤버인지 판단할 수 있는 메소드를 구현해달라는 요구사항이 존재.
	  => object class의 equals method를 override하여 구현하는 것이 좋다고 판단
*/

public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member("hong");
		Member m2 = new Member("hong");
		Member m3 = new Member("kim");
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2가 동일한 멤버입니다.");
		}else {
			System.out.println("m1과 m2가 동일한 멤버가 아닙니다.");
		}
		
		if(m1.equals(m3)) {
			System.out.println("m1과 m3가 동일한 멤버입니다.");
		}else {
			System.out.println("m1과 m3가 동일한 멤버가 아닙니다.");
		}
		
		
	}

}
