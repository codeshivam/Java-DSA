package Pattern1;

import java.util.Scanner;

public class SquarePatterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=1;
		while(i<=N) {
			int j=1;
			while(j<=N) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
