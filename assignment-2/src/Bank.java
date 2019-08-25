package Bank;

import java.util.Scanner;
import java.lang.Math;

class BankAccounts {

	static Scanner keyboard = new Scanner(System.in);

	protected String customerName;
	int accountNumber;
	int type;
	double balance;
	double amount;
	double withdrawalAmount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	BankAccounts() {
		setCustomerName(" ");
		setAccountNumber(0);
		setType(1);
		setBalance(0);
	}

	void input() {
		System.out.println("Enter customer name:");
		setCustomerName(keyboard.next());

		System.out.println("Enter account number:");
		setAccountNumber(keyboard.nextInt());

		System.out.println("Accounts: \n 1.Current Account \n 2.Saving Account. \n Enter type:(1/2): ");
		setType(keyboard.nextInt());

		System.out.println("Enter balance:");
		setBalance(keyboard.nextDouble());

	}

	void display() {
		System.out.println("Customer Name-" + getCustomerName());
		System.out.println("Account Number-" + getAccountNumber());
		if (getType() == 1)
			System.out.println("Type- Current Account");
		else if (getType() == 2)
			System.out.println("Type- Current Account");
		System.out.println("Balance-" + getBalance());
	}

	void deposit() {
		System.out.println("\n Enter the amount to deposit");
		setAmount(keyboard.nextDouble());
		setBalance(getBalance() + getAmount());
	}
}

class SavingAccount extends BankAccounts {
	private double interest;
	int time;
	static int rate;

	public double getInterest() {
		return interest;
	}

	public void setInterest(double d) {
		this.interest = d;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		SavingAccount.rate = rate;
	}

	double compoundInterest() {
		setRate(5);
		System.out.println("\n Enter time:");
		setTime(keyboard.nextInt());

		setInterest(getBalance() * Math.pow(1 + getRate() / 100.0, getTime()));
		return getInterest();
	}

	void updateBalance() {
		setBalance(getBalance() + compoundInterest());
	}

	void withdrawal(BankAccounts customer) {

		System.out.println("\n Enter amount to withdrawn:-");
		setWithdrawalAmount(keyboard.nextDouble());

		if (customer.getBalance() >= getWithdrawalAmount()) {
			setBalance(customer.getBalance() - getWithdrawalAmount());
		} else {
			System.out.println("\n The amount cannot be withdrawn.");
		}
	}
}

class CurrentAccount extends BankAccounts {
	private double penality;

	public double getPenality() {
		return penality;
	}

	public void setPenality(double penality) {
		this.penality = penality;
	}

	int minimumBalance() {
		int ret1 = 1;
		if (getBalance() <= 1000) {
			setPenality(500);
			setBalance(getBalance() - getPenality());
			ret1 = 0;
		} else {
			System.out.println("\n No penality imposed.");
		}
		return ret1;
	}

	void withdrawal(BankAccounts customer) {
		System.out.println("\n Enter the amount to withdrawn:-");
		setWithdrawalAmount(keyboard.nextDouble());
		int k = minimumBalance();
		if (k == 1) {
			if (getBalance() >= getWithdrawalAmount())
				setBalance(getBalance() - getWithdrawalAmount());
		} else {
			System.out.println("\n The amount cannot be withdrawn.");
		}
	}
}

class Bank {
	public static void main(String args[]) {
		System.out.println("Welcome to GS Bank. ");
		BankAccounts customer = new BankAccounts();
		Scanner keyboard = new Scanner(System.in);
		customer.input();
		customer.display();

		System.out.println("Transaction:-\n 1.Deposit amount. \n 2. Withdraw amount. \nEnter choice(1/2):  ");
		int choice = keyboard.nextInt();

		if (choice == 1) {
			customer.deposit();
			customer.display();
		} else {
			if (customer.getType() == 1) {
				CurrentAccount c1 = new CurrentAccount();
				c1.withdrawal(customer);
				customer.display();
			} else if (customer.getType() == 2) {

				SavingAccount s1 = new SavingAccount();
				s1.withdrawal(customer);
				customer.display();
			}
		}
		keyboard.close();
	}
}
