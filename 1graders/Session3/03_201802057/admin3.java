package admin;
import java.util.Scanner;
public class admin3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n을 입력하시오.");
		int n = sc.nextInt();
		int count=1;
		while (n>=count) {
			
			for (int i=1; count >= i; i++) {
				System.out.print("*");
			}	
			count++;
			System.out.println();
		}		
	}
}


