package examples;

public class Lastprimeno {

	public static void main(String[] args) {
		for(int i=100,k=0,m=0;i>=1;i--){
			int counter=0;
			for(int p=1;p<=i;p++) {
				if(i%p==0)counter++; 
			}if(counter==2)
			m++;
			if(m==1){
						System.out.print("the number at last place is "+i+" ");
						break;
						
					}
				}
	}
}