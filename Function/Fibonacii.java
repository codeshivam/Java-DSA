package Function;

import java.util.Scanner;

public class Fibonacii {
	
	public static boolean isFibonacii(int n) {
		if(n==0)
			return true;
		if(n == 1)
			return true;
		int n1 = 0;
		int n2 = 1;
		int i = 2;
		while(i<=n) {
			int fib = n1 + n2;
			if(fib == n)
				return true;
			n1 = n2;
			n2 = fib;
			i++;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isFibo = isFibonacii(n);
		System.out.println(isFibo);
	}

}
