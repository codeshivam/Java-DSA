package Pattern2;

import java.util.Scanner;

public class IsocelesCountPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int p = 1;
		while(i<=N) {
			// For space
			int j= 1;
			while(j<=N-i) {
				System.out.print(' ');
				j++;
			}
			//For ith col print counting no
			j=1;
			int count = i;
			while(j<=i) {
				System.out.print(count++);
				//count++;
				p++;
				j++;
			}
			//for decreasing number
			j = 1;
			count = count-2;
			while(j<=i-1) {
				System.out.print(count--);
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
