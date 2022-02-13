package Operators_and_forLoop;

import java.util.Scanner;

public class TermAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for(int i =1; count<=N-1; i++) {
			int val = 3*i + 2;
			if(val%4 != 0) {
				System.out.print(val+" ");
				count++;
			}
		}
	}

}
