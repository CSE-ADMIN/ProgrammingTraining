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
		System.out.println("���� 1 ���� �Է�");
		System.out.print("���� ��ȣ : ");
		ac1.accountNumber = sc.nextInt();
		System.out.print("������ : ");
		ac1.owner = sc.nextLine();
		sc.next();
		System.out.print("�ʱ� �ܾ� : ");
		ac1.balance = sc.nextInt();
		System.out.println(ac1.toString());
		
		
		
	}

}
