package Practice02;

import java.util.Scanner;

public class Practice02_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double a;
	double b;
	double c;
	
	System.out.print("ù���� �� �Է�: ");
	a=sc.nextDouble();
	System.out.print("�ι��� �� �Է�: ");
	b=sc.nextDouble();
	System.out.print("����° �� �Է�: ");
	c=sc.nextDouble();
	
	double sum;
	sum=(a+b+c)/3;
	System.out.print("�� ���� ��հ�: "+sum);
	}
}
