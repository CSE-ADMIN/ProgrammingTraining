package 어드민;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=1;
		int c=0;	
		System.out.print("피보나치 수열: ");
		
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
		
		System.out.println();

	}

}
