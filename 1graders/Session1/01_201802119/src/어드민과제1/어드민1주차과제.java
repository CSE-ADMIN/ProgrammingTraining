package ���ΰ���1;

import java.util.Scanner;

public class ����1�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ȯ�� �� �Է� : ");
		int tag;
		int min;
		int hour;
		int sec;
		
		tag = input.nextInt();
		hour = tag/3600;
		min = (tag%3600)/60;
		sec = tag - (hour*3600 + min*60);
		System.out.print(tag+"�ʴ�"+hour+"�ð�"+min+"��"+sec+"���Դϴ�.");
		
		

	}

}
