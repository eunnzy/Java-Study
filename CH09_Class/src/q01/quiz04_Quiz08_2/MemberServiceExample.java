package q01.quiz04_Quiz08_2;

// 교재 연습문제 풀기 15번
public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		// 아이디 비밀번호 맞는지 확인
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
