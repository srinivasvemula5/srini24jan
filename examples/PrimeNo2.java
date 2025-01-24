package examples;

public class PrimeNo2 {
	public static void main(String[] args) {
	for(int i=1,k=0;i<=100;i++){
		int counter=0;
		for(int p=1;p<=i;p++) {
			if(i%p==0)counter++; 
		}if(counter==2) {
					System.out.print(i+" ");
					k++;
					if(k==6) {
						System.out.println();k=0;
					}
					
				}
			}
		}
		
	}

