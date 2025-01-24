package examples;
import java.util.Scanner;
public class prog3 {
	public static void main(String[] args){	
		char ch;
		char cod;
		Scanner sc= new Scanner(System.in);
		int upAsc =  (int)'A';
		int lowAsc =  (int)'a';
		int diff= upAsc-lowAsc;
		if(diff<0)diff=-diff;
		do {
			System.out.println("enter string");
			ch= sc.next().charAt(0);
			if((ch>='A')&&(ch<='z')) {
				System.out.println("upper");
				ch=(char)(ch+diff);
			}
			else if((ch>='a')&&(ch<='z')) {
				System.out.println("lower");
				ch=(char)(ch-diff);
			}
			System.out.println("ch--->"+ch);
			System.out.println("y or n");
			cod=sc.next().charAt(0);
			if(cod=='n')cod = 0;
			else cod=1;
			
		}
		while(cod==1);
		System.out.println("ends");
	}
}
		
		

