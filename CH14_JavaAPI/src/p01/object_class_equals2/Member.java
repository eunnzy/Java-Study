package p01.object_class_equals2;

public class Member {
	public String id;
//	public int ranking;
	
	public Member() {
		
	}
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		// Member instance가 Object type으로 promotion 발생.
		if(obj instanceof Member) {		// parameter(obj)가 Member class 인지 확인하고
			Member member = (Member) obj;	// casting 해줌.
			
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
	
}
