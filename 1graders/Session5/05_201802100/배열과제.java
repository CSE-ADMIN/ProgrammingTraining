import java.util.Scanner;

public class 배열과제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getTotal(arr));
		System.out.println(getAverage(arr));
		System.out.println(getMaximum(arr));
		System.out.println(getMinimum(arr));
		
	}

	public static int getTotal(int[] array) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {

			sum += array[i];

		}
		return sum;
	}
	public static double getAverage(int[] array) {
		int sum =getTotal(array);
		double average=sum/5.0;
		return average;
	}
	public static int getMaximum(int[] array) {
		int Max = array[0];
		for(int i=0 ;i<5;i++) {
			if(array[i]>Max) {
				Max = array[i];
			}
		}
		return Max;
	}
	public static int getMinimum(int[] array) {
		int Min =array[0];
		for(int i=0 ;i<5;i++) {
			if(array[i]<Min) {
				Min = array[i];
				
			}
		}
		return Min;
	}
}
