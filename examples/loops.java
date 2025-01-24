package examples;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i = 0; i <=n; i++) {
			for (int j =n ; j > i; j--) {
				System.out.print("  ");
	 		}
			for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
			}
			System.out.println();
			
		
		}
		
	for (int i = n; i >=1;i--) {
		for (int j = n; j >= i; j--) {
			System.out.print("  ");
 		}
		for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("* ");
		}
		System.out.println();
	}
	
}
}