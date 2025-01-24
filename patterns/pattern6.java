package patterns;

public class pattern6 {
	public static void main(String[] args) {
		for(int i=1;i<=15;i++) {
			for(int k=1;k<=15;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=30;j++) {
				if((i==1)||(i==15)){
					System.out.print("*");
				}else {
					if((j==1)||(j==30)){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
			}
			}System.out.println();
			
		}

		}
	}


