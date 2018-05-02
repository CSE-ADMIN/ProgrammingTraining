import java.util.Scanner;
public class 과제03_201802071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("입력: ");
		n=input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
