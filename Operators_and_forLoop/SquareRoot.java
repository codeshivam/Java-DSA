package Operators_and_forLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <=3) {
			System.out.println(1);
			return;
		}
		int i = 2;
		int current = 1;
		while(i<=N/2) {
			current = i*i;
			if(current > N) {
				System.out.println(--i);
				break;
			}
			if(current == N) {
				System.out.println(i);
				break;
			}
			i++;
		}
		//System.out.println(1);
	}

}
