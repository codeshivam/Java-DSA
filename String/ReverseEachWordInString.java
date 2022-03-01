package String;

import java.util.Scanner;

public class ReverseEachWordInString {
	
public static void reverse(char c[], int start,int end) {
		
		char temp;
		while(start<=end) {
			temp = c[start];
			c[start++] = c[end]; 
			c[end--] = temp;
		}
	}
	
	public static String reverseEachWord(String str) {
		//Your code goes here
//		char c[] = str.toCharArray();
//		int start = 0;
//		for(int end = 0; end<c.length;end++) {
//			if(c[end] == ' ') {
//				int j = end - 1;
//				while(start<=j) {
//					char temp = c[start];
//					c[start++] = c[j];
//					c[j--] = temp;
//				}
//				start = end +1;
//			}
//		}
//		int j = c.length -1;
//		while(start<=j) {
//			char temp = c[start];
//			c[start++] = c[j];
//			c[j--] = temp;
//		}
//		
//		String strReversed = new String(c);
//		return strReversed;
		char c[] =str.toCharArray();
		int start = 0;
		for(int end = 0; end<c.length; end++) {
			if(c[end] == ' ') {
				reverse(c,start,end-1);
				start = end+1;
			}
			
		}
		//Reverse last word
		reverse(c, start, c.length - 1);
		String res = new String(c);
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reversed = reverseEachWord(str);
		System.out.println(reversed);
	}

}
