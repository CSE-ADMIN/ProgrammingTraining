package ADMIN_02;

import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("n번째 항 입력 ");
	      int n = sc.nextInt();
	      
	      int a = 0;
	      int b = 1;
	      int c;
	      
	      for(int i=1; i<=n; i++) {
	         
	         if(i == 1) {
	            System.out.println(i + "항: " + a);
	         }
	         else if(i == 2) {
	            System.out.println(i + "항: " + b);
	         }
	         else {            
	            c = a + b;
	            System.out.println(i + "항: " + c);
	            a = b;
	            b = c;
	         }
	      }
	}
}

