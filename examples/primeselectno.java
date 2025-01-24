package examples;

public class primeselectno {
	public static void main(String[] args) {
		for(int i=1,k=0;i<=100;i++){
			int counter=0;
			for(int p=1;p<=i;p++) {
				if(i%p==0)counter++; 
			}if(counter==2) {
				if(i%10==3 || i/10==3)
						System.out.print(i+" ");
				if(++k%2==0) {
					System.out.println();k=0;
				}
							System.out.print("");
						}
						
					}
				}
}