package q01.quiz05_Quiz03;

public class PolyMain {
	
	public static void main(String[] args) {
		Account obj1 = new Account("111-22-3333", "임꺽정", 10000);
		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000, "5555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("777-22-3333", "김선달",3000, 2000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-0000", "김미영", 0, 0);
		
		// 계좌정보 출력 메소드 호출
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}

	// 계좌 정보 출력 메소드
	static void printAccountInfo(Account obj) {		// 파라미터에서 자동형변환 발생
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 이름 " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println();
	}
}
