package Operators_and_forLoop;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int sum = 0;
		int pro = 1;
		if(C == 1) {
			for(int i = 1; i<=N; i++) {
				sum += i;
			}
			System.out.println(sum);
			return;
		}
		if(C == 2) {
			for(int i = 1; i<=N; i++) {
				pro *= i;
			}
			System.out.println(pro);
			return;
		}
		else
			System.out.println(-1);
	}

}
