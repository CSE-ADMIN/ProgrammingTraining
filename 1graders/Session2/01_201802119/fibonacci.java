package ����;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=1;
		int c=0;	
		System.out.print("�Ǻ���ġ ����: ");
		
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
		
		System.out.println();

	}

}
