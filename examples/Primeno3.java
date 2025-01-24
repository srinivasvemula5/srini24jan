package examples;

public class Primeno3 {
	public static void main(String[] args) {
	for(int i=1,k=0,m=0;i<=100;i++){
		int counter=0;
		for(int p=1;p<=i;p++) {
			if(i%p==0)counter++; 
		}if(counter==2) {
					System.out.print(i+" ");
					if(++k%8==0) {
						System.out.println();k=0;
					}
					
				}
			}
		}
		
	}

