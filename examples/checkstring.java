package examples;
import java.util.Scanner;

public class checkstring {

	public static void main(String[] args) {
		
		System.out.println("enter the charecter");
		Scanner sc=new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
		}
		else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        }
		else {
            System.out.println(ch + " is a special character.");
        }
        
		
	}

}
