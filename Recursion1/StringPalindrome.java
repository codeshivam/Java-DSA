package Recursion1;

/*
 * Check Palindrome (recursive)
	Send Feedback
	
	
	Check whether a given String S is a palindrome using recursion. Return true or false.
	Input Format :
	String S
	Output Format :
	'true' or 'false'
	Constraints :
	0 <= |S| <= 1000
	where |S| represents length of string S.
	Sample Input 1 :
	racecar
	Sample Output 1:
	true
	Sample Input 2 :
	ninja
	Sample Output 2:
	false
 */

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		if(input.length() == 0)
			return false;
		boolean res = isStringPalindrome(input,0,input.length()-1);
		return res;
	}
	
	
	private static boolean isStringPalindrome(String str, int start, int last) {
		// TODO Auto-generated method stub
		if(start >= last)
			return true;
		if(str.charAt(start) != str.charAt(last)) {
			return false;
		}
		return isStringPalindrome(str, start + 1, last - 1);
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//int n = s.nextInt();
		boolean res = isStringPalindrome(str);
		System.out.println(res);
	}

}
