package cp_hw01;

import java.util.Scanner;


public class cp_hw01 {
	public static void main(String args[]) {
		
		int seconds; //��
		int minutes; //��
		int hours; //�ð�
		int time; //ó�� �Է� ���� ��

		Scanner sc = new Scanner(System.in);
	
		System.out.print("��ȯ�� �� �Է� : ");
		time = sc.nextInt();
		
		hours = time/3600; //1�ð��� 3600��
		minutes = (time - 3600*hours)/60; //1���� 60��
//		seconds = time - 3600*hours - 60*minutes;
		seconds = time%60; //60���� ������ �� ������

		
		System.out.print(time+"�ʴ� "+hours+"�ð� "+minutes+"�� "+seconds+"�� �Դϴ�.");
	}
}

