import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour;
		int min;
		int sec;
		System.out.print("�ʸ� �Է��Ͻÿ�: ");
		sec = sc.nextInt();
			
		hour = (int) sec/3600;
		min = (int) (sec-3600*hour)/60;
			
		System.out.println(sec+"�ʴ� "+ hour+"�ð� "+min+"�� "+(sec-3600*hour-60*min)+"���Դϴ�.");
					

	}

}
