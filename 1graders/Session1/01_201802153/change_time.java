import java.util.Scanner;

public class change_time {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("�ʸ� �Է��ϼ��� : ");
			int sec = sc.nextInt();
			
		    int hour = sec/3600;
			int min = sec%3600/60;
			int seconds = sec%3600%60;
			System.out.println(hour+"�ð� "+ min+"�� " +seconds+"��"+ "�� �����մϴ�.");
		
	}
	
}
