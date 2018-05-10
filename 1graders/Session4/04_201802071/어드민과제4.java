import java.util.Scanner; 
class BankAccount{
	 String accountNumber;
	 String owner;
	 int balance;
	 public BankAccount(String a,String o, int b) {
		 accountNumber=a;
		 owner=o;
		 balance=b;
	 }
	 public void deposit(int amount) {
		 balance+=amount;
	 }
	 public void withdraw(int amount) {
		 balance-=amount;
	 }
	 public String toString() {
		 return""+balance;
	 }
	 public void sendAccount(int amount, BankAccount otherAccount) {
		 this.withdraw(amount);
		 otherAccount.deposit(amount);
	 }
	 public BankAccount() {
		 
	 }
 }
public class 어드민과제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호: ");
		ba1.accountNumber=sc.next();
		System.out.print("예금주: ");
		ba1.owner=sc.next();
		System.out.print("초기잔액: ");
		ba1.balance=sc.nextInt();
		
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호: ");
		ba2.accountNumber=sc.next();
		System.out.print("예금주: ");
		ba2.owner=sc.next();
		System.out.print("초기잔액: ");
		ba2.balance=sc.nextInt();
		
		System.out.print("계좌 1에서 계좌2로 송금할 금액: ");
		int amount=sc.nextInt();
		
		ba1.withdraw(amount);
		System.out.println("계좌1");
		System.out.println(ba1.accountNumber);
		System.out.println(ba1.owner);
		System.out.println(ba1.balance);
		ba2.deposit(amount);
		System.out.println("계좌2");
		System.out.println(ba2.accountNumber);
		System.out.println(ba2.owner);
		System.out.println(ba2.balance);

	}

}
