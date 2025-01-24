package examples;

import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		long num,r;
		boolean isprime=true;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2;i<num;i++) {
			r=num%i;
			if(r==0) {
				isprime=false;
				break;
			}
			
		}
		System.out.println(isprime);
		System.out.println(num);


	}

}
