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
			System.out.println("돈 없음");
		} else {
			balance += amount;
		}
	}

	public int balance() {
		return balance;
	}

	public void check() {
		System.out.print("현재 계좌 1의 잔액");
		System.out.println(balance);
	}

	public void sendAccount(int amount, BankAccount otherAccount) {
		if (amount > balance) {
			System.out.println("잔액이 부족합니다.");
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

		System.out.println("계좌1 정보 입력");

		System.out.print("계좌 입력  : ");
		num1.account_number_1 = sc.nextLine();

		System.out.print("예금주 : ");
		System.out.println("김동훈");

		System.out.print("초기금액을 입력하라.");
		num1.deposit(sc.nextInt());
		System.out.print("초기금액: ");
		num1.check();

		BankAccount num2 = new BankAccount();
		System.out.println("계좌 입력:");
		num2.account_number_2 = sc.nextLine();
		num2.account_number_2 = sc.nextLine();
		
		System.out.print("예금주 : ");
		System.out.println("어드민");
		System.out.print("초기금액을 입력하라.");
		num2.deposit(sc.nextInt());
		System.out.print("초기금액: ");
		num2.check();

		System.out.println("송금할 금액을 입력하시오.");
		num1.sendAccount(sc.nextInt(), num2);
		System.out.println("김동훈의 잔액:" + num1.balance());
		System.out.println("어드민의 잔액:" + num2.balance());
	}
}
