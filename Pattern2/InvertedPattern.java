package Pattern2;

import java.util.Scanner;

public class InvertedPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int j = 1;
			while(j<=(N-i+1)) {
				//System.out.print('*');
				//System.out.print(N-i+1);
				System.out.print(N-j+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
