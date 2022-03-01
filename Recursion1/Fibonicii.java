package Recursion1;

import java.util.Scanner;

public class Fibonicii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int res = fib(n);
		System.out.println(res);
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

}
