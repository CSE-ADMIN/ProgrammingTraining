import java.util.Scanner;

class BankAccount{
	private String accountNumber;
	private String owner;
	public int balance;
	Scanner sc = new Scanner(System.in);
	
	public void Account() {
		System.out.print("계좌번호 : ");
		accountNumber = sc.nextLine();
		System.out.print("예금주 : ");
		owner = sc.nextLine();
		System.out.print("초기 잔액 : ");
		balance = sc.nextInt();
	}
	
	void deposit (int amount) {
		balance+=amount;
	}
	
	void withdraw (int amount) {
		if (balance-amount <0)
			System.out.println("잔액이 부족합니다.");
		else
			balance-=amount;
	}
	
	public String toString() {
		String buf="";
		buf+="계좌번호 : " + accountNumber + "\n";
		buf+="예금주 : " + owner + "\n";
		buf+="잔액 : " + balance;
		return buf;
	}
	public void sendAccount(int amount, BankAccount otherAccount) {
		if (balance>amount) {
			withdraw(amount);
			otherAccount.deposit(amount);
		}
		else
			System.out.println("잔액이 부족합니다.");
	}
}


public class report1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ac1 = new BankAccount();
		BankAccount ac2 = new BankAccount();
		
		System.out.println("계좌1");
		ac1.Account();
		System.out.println("계좌2");
		ac2.Account();
		
		System.out.println("===========================");
		System.out.print("계좌1에서 계좌2로 보낼 금액 : ");
		int money = sc.nextInt();
		ac1.sendAccount(money, ac2);
		System.out.println("===========================");
		
		System.out.println("계좌1");
		System.out.println(ac1.toString());
		System.out.println("계좌2");
		System.out.println(ac2.toString());
		
	}

}
