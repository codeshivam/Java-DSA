package Pattern2;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>0) {
		N = N*2 -1;
		}
		//print * in starting
		System.out.println('*');
		int i=1;
		if(N>0) {
			//this loop for half
			while(i<=N/2+1) {
				//print * in starting of every row
				System.out.print('*');
				int j= 1;
				int p = 1;
				while(j<=i) {
					System.out.print(p++);
					j++;
				}
				
				p = p -2;
	//			j = 1;
				while(p>=1) {
					System.out.print(p--);
				}
				System.out.print('*');
				System.out.println();
				i++;
			}
			//this is for another half
				i = N/2;
			while(i>=1) {
				System.out.print('*');
				int j= 1;
				int p = 1;
				while(j<=i) {
					System.out.print(p++);
					j++;
				}
				
				p = p -2;
	//			j = 1;
				while(p>=1) {
					System.out.print(p--);
				}
				System.out.print('*');
				System.out.println();
				i--;
			}
		}
		System.out.println('*');
		

	}

}
