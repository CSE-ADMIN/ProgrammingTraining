package admin;
import java.util.Scanner;
public class admin3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n�� �Է��Ͻÿ�.");
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


