package prac;

public class Noofalphabet {

	public static void main(String[] args) {
	
		String data = "sfdkjlasfopqwriqwercxvmnxzcvqwerweoqr";
		// a-z---26
		int[] count = new int[26];
		
		for(int i=0;i<data.length();i++) {
			char ch =  data.charAt(i);
			// a----97
			// b----98
			count[ch - 97]++;//==== count[0]
		}// for
		
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97)+"--->"+count[i]);
		}
	}

}