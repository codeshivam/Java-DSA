package String;

import java.util.Scanner;

public class AllSubstring {
	
	public static void printSubstrings(String str) {
		//Your code goes here
		int n = str.length();
		int i = 0;
		while(i<n) {
			int j = i + 1;
			while(j<n) {
				System.out.println(str.substring(i, j));
				j++;
			}
			System.out.println(str.substring(i));
			i++;	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printSubstrings(str);
	}

}
