import java.util.Scanner;

class Numbering{
	int sum;
	double average;
	int maximum;
	int minimum;
	
	
	int getTotal(int[] array) {
		for (int i=0;i<5;i++) 
			sum+=array[i];
			return sum;
	}
	
	double getAverage(int[] array) {
		average=(double) sum/5;
		return average;
	}
	
	int getMaximum(int[] array) {
		maximum = array[0];
		for (int i=0;i<5;i++) {
			if (maximum<array[i]) 
				maximum = array[i];
		}
		return maximum;
	}
	
	int getMinimum(int[] array) {
		minimum = array[0];
		for (int i=1;i<5;i++) {
			if (minimum>array[i])
				minimum = array[i];
		}
		return minimum;
	}
}


public class report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Numbering n = new Numbering();
		int[] array = new int[5];
		
		for (int i=0;i<5;i++) {
			System.out.print("정수를 입력하시오 : ");
			array[i]=sc.nextInt();
		}
		System.out.println(n.getTotal(array));
		System.out.println(n.getAverage(array));
		System.out.println(n.getMaximum(array));
		System.out.println(n.getMinimum(array));
	}

}
