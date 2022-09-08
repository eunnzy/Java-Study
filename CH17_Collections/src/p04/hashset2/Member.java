package p04.hashset2;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {		// HashSet에 객체 삽입시 객체 동일한지 확인하기 위해
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (this.name.equals(member.name)) && (this.age == member.age);
		}
		return false;
	}
	
	@Override
	public int hashCode() {			// HashSet에 객체 삽입시 객체 동일한지 확인하기 위헤
		// String의 hashCode() 값 (문자열이 동일하면 hashCode값도 동일함) + 정수값(age)
		return name.hashCode() + age;
		
	}
	
}
