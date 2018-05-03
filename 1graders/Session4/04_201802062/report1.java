import java.util.Scanner;

class BankAccount{
	private String accountNumber;
	private String owner;
	public int balance;
	Scanner sc = new Scanner(System.in);
	
	public void Account() {
		System.out.print("���¹�ȣ : ");
		accountNumber = sc.nextLine();
		System.out.print("������ : ");
		owner = sc.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		balance = sc.nextInt();
	}
	
	void deposit (int amount) {
		balance+=amount;
	}
	
	void withdraw (int amount) {
		if (balance-amount <0)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance-=amount;
	}
	
	public String toString() {
		String buf="";
		buf+="���¹�ȣ : " + accountNumber + "\n";
		buf+="������ : " + owner + "\n";
		buf+="�ܾ� : " + balance;
		return buf;
	}
	public void sendAccount(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);	
	}
}

public class report1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount ac1 = new BankAccount();
		BankAccount ac2 = new BankAccount();
		
		System.out.println("����1");
		ac1.Account();
		System.out.println("����2");
		ac2.Account();
		
		System.out.println("===========================");
		System.out.print("����1���� ����2�� ���� �ݾ� : ");
		int money = sc.nextInt();
		
		ac1.sendAccount(money, ac2);
		System.out.println("===========================");
		System.out.println("����1");
		System.out.println(ac1.toString());
		System.out.println("����2");
		System.out.println(ac2.toString());
		
	}

}
