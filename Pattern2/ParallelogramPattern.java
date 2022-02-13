package Pattern2;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int space = 1;
			while(space<i) {
				System.out.print(' ');
				space++;
			}
			int j = 1;
			while(j<=N) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
