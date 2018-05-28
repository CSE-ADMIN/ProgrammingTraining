package admin;

import java.util.Scanner;

class BankAccount {

	String account_number_1, account_number_2;
	String owner = null;
	int balance;

	public void deposit(int amount) {
		balance += amount;

	}

	public void withdraw(int amount) {
		if (balance - amount < 0) {
			System.out.println("�� ����");
		} else {
			balance += amount;
		}
	}

	public int balance() {
		return balance;
	}

	public void check() {
		System.out.print("���� ���� 1�� �ܾ�");
		System.out.println(balance);
	}

	public void sendAccount(int amount, BankAccount otherAccount) {
		if (amount > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			balance = balance - amount;
			otherAccount.balance += amount;
		}
	}

}

public class admin_503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount num1 = new BankAccount();

		System.out.println("����1 ���� �Է�");

		System.out.print("���� �Է�  : ");
		num1.account_number_1 = sc.nextLine();

		System.out.print("������ : ");
		System.out.println("�赿��");

		System.out.print("�ʱ�ݾ��� �Է��϶�.");
		num1.deposit(sc.nextInt());
		System.out.print("�ʱ�ݾ�: ");
		num1.check();

		BankAccount num2 = new BankAccount();
		System.out.println("���� �Է�:");
		num2.account_number_2 = sc.nextLine();
		num2.account_number_2 = sc.nextLine();
		
		System.out.print("������ : ");
		System.out.println("����");
		System.out.print("�ʱ�ݾ��� �Է��϶�.");
		num2.deposit(sc.nextInt());
		System.out.print("�ʱ�ݾ�: ");
		num2.check();

		System.out.println("�۱��� �ݾ��� �Է��Ͻÿ�.");
		num1.sendAccount(sc.nextInt(), num2);
		System.out.println("�赿���� �ܾ�:" + num1.balance());
		System.out.println("������ �ܾ�:" + num2.balance());
	}
}
