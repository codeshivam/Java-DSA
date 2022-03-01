package String;

import java.util.Scanner;

public class StringPellindrome {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		if(str.length() == 0)
			return false;
		int i = str.length() -1;
		//char temp[] = new char[str.length()];
		String str1 = "";
		int j = str.length();
		while(i >=0) {
			str1 +=str.charAt(i);
			i--;
		}
		if(str1.equals(str))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean  pellindrome = isPalindrome(str);
		System.out.println(pellindrome);
	}
}
