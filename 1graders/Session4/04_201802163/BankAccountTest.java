import java.util.Scanner;

class BankAccount {
	public int accountNumber;
	public String owner;
	public int balance;
	
	public BankAccount(int a, String b,int c) {
		accountNumber=a;
		owner = b;
		balance = c;
	}
	public String toString() {
		return ""+balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	public void sendAccount(int amount,BankAccount otherAccount) {
		this.balance =- amount;
		otherAccount.balance += amount;
	
		
	}
	public BankAccount() {
		
	}
}
public class BankAccountTest {
	public static void main(String args[]) {
		BankAccount ac1 = new BankAccount();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌 1 정보 입력");
		System.out.print("계좌 번호 : ");
		ac1.accountNumber = sc.nextInt();
		System.out.print("예금주 : ");
		ac1.owner = sc.nextLine();
		sc.next();
		System.out.print("초기 잔액 : ");
		ac1.balance = sc.nextInt();
		System.out.println(ac1.toString());
		
		
		
	}

}
