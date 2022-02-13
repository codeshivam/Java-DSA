package Pattern2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int total = 0;
			int j = 1;
			int p = 1;
			while(j<=i) {
				total+=j;
				System.out.print(p++);
				if(j<i)
					System.out.print('+');
				j++;
			}
			System.out.print('=');
			System.out.print(total);
			System.out.println();
			i++;
		}
	}

}
