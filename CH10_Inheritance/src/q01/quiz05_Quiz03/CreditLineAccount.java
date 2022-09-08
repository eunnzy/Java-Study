package q01.quiz05_Quiz03;

public class CreditLineAccount extends Account{
	public int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	@Override
	public int withdraw(int amount) throws Exception {	// 인출하는 기능 다시 구현
		if((balance + creditLine) < amount) 
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return balance;
	}

}
