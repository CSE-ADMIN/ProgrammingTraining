package admin;

import java.util.Scanner;

public class seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int osec;
		int sec;
		int min;
		int hour;
		
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		osec = sc.nextInt();
		
		hour = osec/3600;
		min = (osec%3600)/60;
		sec = osec - (hour * 3600) - (min * 60);
		
		System.out.print(hour + "�ð� " + min + "�� " + sec + "�� ");
		
		
		
		
		

	}

}
