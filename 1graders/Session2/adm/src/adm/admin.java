package adm;

public class admin {

	public static void main(String[] args) {

		int x = 1;
        int y = 1;
        int z;
        
        System.out.println(x);
        System.out.println(y);
        
        for(int i=1; i<=8; i++){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }        


	}

}
