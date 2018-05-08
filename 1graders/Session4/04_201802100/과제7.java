import java.util.Scanner;

class BankAccount {
	String accountNumber;// 계좌번호
	String owner;// 예금주
	int balance;// 잔액 표시
	
	void Number() {
		System.out.println("계좌번호 : " + accountNumber);
	}

	void owner() {
		System.out.println("예금주 : " + owner);
	}

	void deposit(int amount) {
		balance += amount;
	}// 저금기능메소드

	void withdraw(int amount) {
		balance -= amount;
	}// 인출 기능 메소드

	public String toString() {
		return "잔액: " + balance;
	}// 잔액 출력 메소드

	public void sendAccount(int amount, BankAccount otherAccount) {
		otherAccount.deposit(amount);
		this.withdraw(amount);
	}// 계좌이체 기능 메소드
	
	
}

public class 과제7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount num1 = new BankAccount();
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호 : ");
		num1.accountNumber = sc.next();
		System.out.print("예금주 : ");
		num1.owner = sc.next();
		System.out.print("초기잔액: ");
		num1.balance = sc.nextInt();
		System.out.println();

		BankAccount num2 = new BankAccount();
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호 : ");
		num2.accountNumber = sc.nextLine();
		num2.accountNumber = sc.nextLine();
		System.out.print("예금주 : ");
		num2.owner = sc.next();
		System.out.print("초기잔액: ");
		num2.balance = sc.nextInt();

		System.out.println("계좌1에서 계좌2로 송금 할 금액 : ");
		int amount = sc.nextInt();
		num1.sendAccount(amount, num2);
		while (true) {
			if(num1.balance<0) {
				System.out.println("오류 입니다.");
				break;
			}
			else {
			System.out.println("===============================");
			System.out.println("계좌1");
			num1.Number();
			num1.owner();
			System.out.println(num1.toString());
			System.out.println();
			System.out.println("계좌2");
			num2.Number();
			num2.owner();
			System.out.println(num2.toString());
			break;
			}
		}
	}

}
