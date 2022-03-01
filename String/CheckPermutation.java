package String;

import java.util.Scanner;

public class CheckPermutation {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String st1 = s.nextLine();
			String str2 = s.nextLine();
			boolean check = isPermutation(st1,str2);
			System.out.println(check);
		}

		private static boolean isPermutation(String st1, String str2) {
			// TODO Auto-generated method stub
			if(st1.length() != str2.length()) {
				return false;
			}
			//create frequency array and increase at ascii index;
			int freqArr[] = new int[256];
			for(int i = 0; i<st1.length(); i++) {
				freqArr[st1.charAt(i)] += 1;
			}
			//decrease for ascii index and check if it is less than zero
			for(int i = 0; i<str2.length(); i++) {
				int res = freqArr[str2.charAt(i)] -= 1;
				if(res<0) {
					return false;
				}
			}
			//if all is zero in freq array it means both are permutation
			return true;
		}

}
