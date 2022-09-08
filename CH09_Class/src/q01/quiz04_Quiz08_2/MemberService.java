package q01.quiz04_Quiz08_2;

public class MemberService {
	private String id;
	private String password;
	
	public MemberService() {
		this.id = "hong";
		this.password = "12345";
	}
	
	// 아이디와 비밀번호가 같은지 확인.
	public boolean login(String id, String password) {
		if((this.id.equals(id)) && (this.password.equals(password))) 
			return true;
		
		return false; // 다르면 false 리턴
	}
	
	public void logout(String id) {
		if(this.id.equals(id)) 
			System.out.println("로그아웃 되었습니다.");
		else
			System.out.println("아이디 정보가 일치하지 않습니다.");
	}
	
}
