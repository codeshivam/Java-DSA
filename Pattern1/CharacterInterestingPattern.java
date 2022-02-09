package Pattern1;

import java.util.Scanner;

public class CharacterInterestingPattern {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int i = 1;
			while(i<=N) {
				int j = 1;
				char c = (char)('A' + N -i);
				//System.out.println(c);
				while(j<=i) {
					System.out.print((char)(c + j - 1));
					j++;
				}
				System.out.println();
				i++;
			}
		}

}
