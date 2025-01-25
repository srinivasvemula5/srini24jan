package prac;
import java.util.Scanner;
public class logic1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charecter");
		char ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z'){
		{
			System.out.println("after conversion---->"+(char)(ch+32));
		}
		}
		else if(ch >= 'a' && ch <= 'z'){
			{
				System.out.println("after conversion---->"+(char)(ch-32));
			}
	}
	}
}