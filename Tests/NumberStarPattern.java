package Tests;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=1;
		
		while(i<=N) {
			int j = 1;
			int p = N;
			while(j<=N) {
				if(j==(N-i+1)) {
					System.out.print("*");
					//continue;
				}
				else
					System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
