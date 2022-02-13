package Pattern2;

import java.util.Scanner;

public class IsocelesStarPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			// For space
			int j= 1;
			while(j<=N-i) {
				System.out.print(' ');
				j++;
			}
			//For ith col print counting no
			j=1;
			//int count = 1;
			while(j<=i) {
				System.out.print('*');
				//count++;
				j++;
			}
			//for decreasing number
			j = 1;
			//count = i-1;
			while(j<=i-1) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
