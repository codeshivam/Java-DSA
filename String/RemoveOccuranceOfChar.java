package String;

import java.util.Scanner;

public class RemoveOccuranceOfChar {
	
	public static String  removeAllOccurrencesOfChar(String str, char ch) {
		//Your code goes here
		String ans ="";
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i) != ch) {
				ans +=str.charAt(i);
			}
			i++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = 'y';
		String str1 = removeAllOccurrencesOfChar(str,ch);
		System.out.println(str1);
	}
}
