package Pattern2;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p;
		int i = 1;
		while(i<=N) {
			p = 2*i -1;
			int j = 1;
			while(j<=N-i+1) {
				System.out.print(p);
				p+=2;
				j++;
			}
			p=1;
			j=1;
			while(j<=i-1) {
				System.out.print(p);
				p+=2;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
