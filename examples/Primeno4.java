package examples;

public class Primeno4 {

	public static void main(String[] args) {
	for(int i=1,k=0,m=0;i<=100;i++){
		int counter=0;
		for(int p=1;p<=i;p++) {
			if(i%p==0)counter++; 
		}if(counter==2)
		m++;
		if(m==15){
					System.out.print("the number at 15th place is "+i+" ");
					m=0;
					k++;
					if(k==6) {
						System.out.println();k=0;
					}
					
				}
			}
		}
		
	}

