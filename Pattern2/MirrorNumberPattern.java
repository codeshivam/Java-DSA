package Pattern2;

import java.util.Scanner;

public class MirrorNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int j =1;
			//for blank n-i
			while(j<=(N-i)) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			int count = j;
			//for No print 
			while(j<=i) {
				System.out.print(count++);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
