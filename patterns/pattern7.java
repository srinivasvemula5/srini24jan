package patterns;

public class pattern7 {
	public static void main(String[] args) {
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(((i+j)+1)%2+" ");
			}System.out.println( );
		}
		
	}

}
 