import java.util.Scanner;

class BankAccount {
	String accountNumber;// ���¹�ȣ
	String owner;// ������
	int balance;// �ܾ� ǥ��
	
	void Number() {
		System.out.println("���¹�ȣ : " + accountNumber);
	}

	void owner() {
		System.out.println("������ : " + owner);
	}

	void deposit(int amount) {
		balance += amount;
	}// ���ݱ�ɸ޼ҵ�

	void withdraw(int amount) {
		balance -= amount;
	}// ���� ��� �޼ҵ�

	public String toString() {
		return "�ܾ�: " + balance;
	}// �ܾ� ��� �޼ҵ�

	public void sendAccount(int amount, BankAccount otherAccount) {
		otherAccount.deposit(amount);
		this.withdraw(amount);
	}// ������ü ��� �޼ҵ�
	
	
}

public class ����7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount num1 = new BankAccount();
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		num1.accountNumber = sc.next();
		System.out.print("������ : ");
		num1.owner = sc.next();
		System.out.print("�ʱ��ܾ�: ");
		num1.balance = sc.nextInt();
		System.out.println();

		BankAccount num2 = new BankAccount();
		System.out.println("����2 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		num2.accountNumber = sc.nextLine();
		num2.accountNumber = sc.nextLine();
		System.out.print("������ : ");
		num2.owner = sc.next();
		System.out.print("�ʱ��ܾ�: ");
		num2.balance = sc.nextInt();

		System.out.println("����1���� ����2�� �۱� �� �ݾ� : ");
		int amount = sc.nextInt();
		num1.sendAccount(amount, num2);
		while (true) {
			if(num1.balance<0) {
				System.out.println("���� �Դϴ�.");
				break;
			}
			else {
			System.out.println("===============================");
			System.out.println("����1");
			num1.Number();
			num1.owner();
			System.out.println(num1.toString());
			System.out.println();
			System.out.println("����2");
			num2.Number();
			num2.owner();
			System.out.println(num2.toString());
			break;
			}
		}
	}

}
