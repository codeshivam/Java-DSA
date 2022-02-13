package Operators_and_forLoop;

import java.util.Scanner;

public class BreakCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int j = 1;
			while(j<=N) {
				System.out.print(j+" ");
				j++;
				if(j>i) {
					break;
				}
			}
			System.out.println();
			i++;
		}
	}

}
