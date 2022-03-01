package String;

import java.util.Scanner;

public class ReverseWordWise {
	
	public static void reverse(char c[], int start,int end) {
		
		char temp;
		while(start<=end) {
			temp = c[start];
			c[start++] = c[end]; 
			c[end--] = temp;
		}
	}
	
	public static String reverseWordWise(String input) {
		// Write your code here
		char c[] =input.toCharArray();
		int start = 0;
		for(int end = 0; end<c.length; end++) {
			if(c[end] == ' ') {
				reverse(c,start,end-1);
				start = end+1;
			}
			
		}
		//Reverse last word
		reverse(c, start, c.length - 1);
		//reverse whole string
		reverse(c, 0, c.length - 1);
		String res = new String(c);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String res = reverseWordWise(str);
		System.out.println(res);
	}

}
