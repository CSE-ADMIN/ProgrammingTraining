import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է��Ͻÿ�:");
		int sec = sc.nextInt();
		int result1 = sec/3600; 
		int result2 = (sec%3600)/60;
		int result3 = (sec%3600)%60;
		System.out.println(result1+"�ð�"+result2+"��"+result3+"��");
	
	}

}
