package String;

import java.util.Scanner;

public class StringCompress {
	
	public static String getCompressedString(String str) {
		//Your code goes here
		String ans ="";
		int count =0;
		int asc =0;
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i) != asc) {
				asc= str.charAt(i);
				if(count>1) {
					ans +=count;
					count = 0;
				}
				if(count>0) {
					count =0;
				}
				ans+=str.charAt(i);
				count++;
			}
			else {
				count++;
				if(i==str.length()-1) {
					ans += count;
				}
					
			}
			i++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = getCompressedString(str);
		System.out.println(str1);
	}

}
