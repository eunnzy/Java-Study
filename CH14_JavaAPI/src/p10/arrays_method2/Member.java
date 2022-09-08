package p10.arrays_method2;

public class Member implements Comparable<Member>{
	String name;
	
	public Member(String name) {
		this.name = name;
	}	
	
	/*
	 	compareValue에 따라 정렬 순서(내림차순, 오름차순) 정함
	*/
	
	@Override
	public int compareTo(Member o) {
//		int compareValue = name.compareTo(o.name);	// 오름차순
//		int compareValue = -name.compareTo(o.name);	// 내림차순
		int compareValue = o.name.compareTo(this.name);	// 내림차순
		return compareValue;
	}


}
