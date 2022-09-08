package q01.quiz05_Quiz03;

public class BonusPointAccount extends Account{
	int bonusPoint;
	
	public BonusPointAccount(String accountNo, String ownerName, int balance ,int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	
	@Override
	public void deposit(int amount) {	// 예금하는 메소드 다시 구현
		balance += amount;	
		super.deposit(amount);		// suoer class의 예금 계산 메소드 호출
		bonusPoint += (int)(amount*0.001);
	}
}
