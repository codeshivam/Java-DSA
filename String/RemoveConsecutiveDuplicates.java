package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		String ans ="";
		int asc =0;
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i) != asc) {
				ans +=str.charAt(i);
				asc = str.charAt(i);
			}
			i++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = removeConsecutiveDuplicates(str);
		System.out.println(str1);
	}

}
