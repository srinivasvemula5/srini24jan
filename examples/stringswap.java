package examples;

public class stringswap {

	public static void main(String[] args) {
		String name1="Ramu";
		String name2="Abdul";
		System.out.println("before swapping........");
		System.out.println("name1------>"+name1);
		System.out.println("name2------>"+name2);
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
		System.out.println("After swapping........");
		System.out.println("name1------>"+name1);
		System.out.println("name2------>"+name2);
		
	}

}
