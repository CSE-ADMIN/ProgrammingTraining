package ADMIN_02;

import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("n��° �� �Է� ");
	      int n = sc.nextInt();
	      
	      int a = 0;
	      int b = 1;
	      int c;
	      
	      for(int i=1; i<=n; i++) {
	         
	         if(i == 1) {
	            System.out.println(i + "��: " + a);
	         }
	         else if(i == 2) {
	            System.out.println(i + "��: " + b);
	         }
	         else {            
	            c = a + b;
	            System.out.println(i + "��: " + c);
	            a = b;
	            b = c;
	         }
	      }
	}
}

