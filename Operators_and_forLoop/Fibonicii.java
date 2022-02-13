package Operators_and_forLoop;

import java.util.Scanner;

public class Fibonicii {

	public int fib(int num) {
		if(num == 0)
			return 0;
		if(num<=2) {
			return 1;
		}
		else
			return (fib(num-1) + fib(num - 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Fibonicii f = new Fibonicii();
		int fibo = f.fib(N);
		System.out.println(fibo);
	}
}
