package Operators_and_forLoop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rev, rem;
		rev = 0;
		while(N>0) {
			rem = N % 10;
			rev = rev * 10 + rem;
			N = N/10;
		}
		System.out.println(rev);
	}

}
