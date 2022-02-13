package Operators_and_forLoop;

import java.util.Scanner;

public class PrintAllPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rem = 0;
		for(int i = 2; i<=N; i++) {
			rem = 0;
			if(i%2 == 0 && i!=2) {
				//System.out.println(i);
				continue;
			}
			
			for(int j = 3; j<=i/2+1; j=j+2) {
				if(i%j == 0) {
					rem = 1;
					break;
				}
			}
			if(rem == 0)
				System.out.println(i);
		}
	}

}
