package q01.quiz04_Quiz04;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	// defeault constructor와 초기값.
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}
	
	public double getMonthlyInterest() {
		this.balance = this.balance *(1 + this.getMonthlyInterestRate()); 
		return this.balance;
	}
	
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}
	
	public double withdraw(double money) {		// 출금
		this.balance -= money;
		return this.balance;
	}
	
	public double deposit(double money) {
		this.balance += money;
		return this.balance;
	}
}
