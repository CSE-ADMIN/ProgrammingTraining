import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("n��° ���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		int first = 0;
		int second = 1;
		int third;

		for (int j = 1; j <= num; j++) {
			if (j == 1) {
				System.out.println(j + "��: " + first);
			} else if (j == 2) {
				System.out.println(j + "��: " + second);
			} else {
				third = first + second;
				System.out.println(j + "��: " + third);
				first = second;
				second = third;

			}
		}
	}
}