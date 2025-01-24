package examples;

public class typpe2func {
	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.print(ch1);
		}
		System.out.println();
		for(int i=1;i<=num2;i++) {
			System.out.print(ch2);
		}
	}

	public static void main(String[] args) {
		pattern('#',10,'*',10);
		 System.out.println("\nwelcome");
		 pattern('#',10,'*',10);
		 System.out.println("\nHyderabad");
		 pattern('#',10,'*',10);
		 System.out.println("\nstpeters college");
		 pattern('#',10,'*',10);
	}




	}


