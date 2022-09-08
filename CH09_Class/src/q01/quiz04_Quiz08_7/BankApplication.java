package q01.quiz04_Quiz08_7;

import java.util.Scanner;

//교재 연습문제 풀기 20번 
public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {		// 계좌 생성 메소드
		System.out.println("************");
		System.out.println("계좌 생성");
		System.out.println("************");
		
		// 계좌번호, 계좌주, 초기입금액 입력
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		
		// 동일한 계좌번호가 있는지 확인하기 위해서
		Account account = findAccount(ano);	
		while(account != null) {		// 동일한 계좌번호가 있으면 루프 계속 실행
			System.out.println("입력한 계좌번호는 이미 존재합니다 다시 입력해주세요.");
			System.out.print("계좌 번호 : ");
			ano = scanner.next();
			account = findAccount(ano);	// 동일한 계좌번호 있는지 확인
		}
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {		// i번째 배열에 정보가 없으면 
				accountArray[i] = new Account(ano, owner, balance);		// 객체 생성하여 배열에 삽입	
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;	// 반복문 종료
			}
		}
	}
	
	private static void accountList() {		// 계좌 목록 출력 메소드
		System.out.println("************");
		System.out.println("계좌 목록");
		System.out.println("************");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null)		// i번째 계좌 정보가 없으면 아직 계좌가 생성이 안되었음.(배열에 정보가 없어 출력할 정보가 없음)
				break;		// 반복문 종료 시킴
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {		// 예금 메소드
		System.out.println("************");
		System.out.println("예금");
		System.out.println("************");
		
		// 예금할 계좌번호와 예금액 입력
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int depositMoney = scanner.nextInt();
		
		Account account = findAccount(ano);	// 입력한 계좌번호가 있는지 찾고
		if(account != null) {	// 입력한 계좌 번호가 맞다면
			int result = account.getBalance() + depositMoney;
			account.setBalance(result);
			System.out.println("결과: 예금이 성공되었습니다.");
		}else {		// 계좌번호가 틀리면
			System.out.println("계좌번호를 다시 확인해주세요");
			System.out.println("결과: 예금을 실패했습니다.");
		}
	}
	
	private static void withdraw() {		// 출금 메소드
		System.out.println("************");
		System.out.println("출금");
		System.out.println("************");
		
		System.out.print("계좌 번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int withdrawMoney = scanner.nextInt();
		
		Account account = findAccount(ano);		// 입력한 계좌번호가 맞으면
		if(account != null) {	
			if(account.getBalance() < withdrawMoney) {		// 통장 잔고 보다 출금 금액이 크다면
				System.out.println("통장에 있는 금액보다 출금 금액이 큽니다.");		// 출금 실패 문구 출력
				System.out.println("결과: 출금을 실패했습니다.");	
			}else {	// account.getBalance() >= withdrawMoney
				int result = account.getBalance() - withdrawMoney;
				account.setBalance(result);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}else { // 입력한 계좌번호가 맞지 않으면
			System.out.println("계좌번호를 다시 확인해주세요");
			System.out.println("결과: 출금을 실패했습니다.");
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {		// i번째 배열의 정보가 null이 아니라면
				if(accountArray[i].getAno().equals(ano)) {		// 입력한 문자열과 i번째 배열의 계좌번호가 맞는지 확인
					account = accountArray[i];
					return account;
				}
			}
		}
		return account;
	}
}
