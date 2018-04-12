package °úÁ¦;

public class Pibonachi {
	public static void main(String args[]) {
		int f0 = 0;
		int f1 = 1;
		int f2;
		
		System.out.println(f0);
		System.out.println(f1);
		for(int i=1;i<=9;i++) {
			f2 = f0 + f1;
			System.out.println(f2);
			f0=f1;
			f1=f2;
			
		}
	}

}
