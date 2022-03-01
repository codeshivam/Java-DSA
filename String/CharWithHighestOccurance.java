package String;

import java.util.Scanner;

public class CharWithHighestOccurance {
	
	public static char highestOccuringChar(String str) {
		//Your code goes here
		char ch = ' ';
		int max=0;
		int freqArr[] = new int[256];
		for(int i =0; i<str.length(); i++) {
			freqArr[str.charAt(i)] += 1;
		}
		for(int i =0; i<str.length(); i++) {
			if(freqArr[str.charAt(i)] > max) {
				max = freqArr[str.charAt(i)];
				ch =	str.charAt(i);
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = highestOccuringChar(str);
		System.out.println(ch);
	}

}
