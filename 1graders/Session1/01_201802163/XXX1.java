import java.util.Scanner;

public class XXX1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է� :");
		int sec = sc.nextInt();
		
		int hour = (int)sec/3600;
		int min = (int)(sec-3600*hour)/60;
		int rsec = sec-(hour*3600+min*60);
		
		System.out.println((int)sec/3600 + "�ð�" + (int)(sec-3600*hour)/60 + "��" + rsec + "��");
		
		
	}

}
