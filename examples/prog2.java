package examples;

import java.util.Scanner;

public class prog2 {
	public static void main(String[] args){
		char ch;
		try (Scanner sc = new Scanner (System.in)){;
		System.out.println("enter char ");
		ch= sc.next().charAt(0);
		if((ch>='A')&&(ch<='z')&&(Character.isUpperCase(ch))) {
			System.out.println("upper case");
				System.out.println("converting to lower");
				
		}
		else if((ch>='a')&&(ch<='z')&&(Character.isLowerCase(ch))){
			System.out.println("lower case");
			System.out.println("ndjwj");
		}
	}
}

}