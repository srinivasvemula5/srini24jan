package examples;
import java.util.Scanner;
public class type4func {
	static float anycountrytoindiarupee(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt*78.67f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.67f;
		}
		else if(country.equalsIgnoreCase("UAE"))
		{
			res=amt*20.67f;
		}
		return res;
	}
	static int getamt() {
		return 100;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country----");
		String country=sc.next();
		String cc=getamtDetails(country);
		System.out.println("please enter  "+cc);
		if(cc.equalsIgnoreCase("country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt=sc.nextInt();
			System.out.println("for "+country+" for this amt="+amt+" indian amt="+anycountrytoindiarupee(country,amt));
		}
	}
	private static String getamtDetails(String country) {
		String res="";
		if(country.equalsIgnoreCase("USA")) {
			res="doller";
		}
		else if(country.equalsIgnoreCase("UK")) {
			res="pounds";
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res="diram";
		}
		else {
			res="country not found";
		}
		
		return res;
	}
}
