package examples;

public class numswap {
	public static void main(String[] args) {
			int n1=100;
			int n2=200;
			System.out.println("before swapping........");
			System.out.println("n1------>"+n1);
			System.out.println("n2------>"+n2);
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
			System.out.println("After swapping........");
			System.out.println("n1------>"+n1);
			System.out.println("n2------>"+n2);
			
		}

	}


