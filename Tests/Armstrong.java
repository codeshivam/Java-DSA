package Tests;

import java.util.Scanner;

public class Armstrong {
	
	public int powerCheck(int x, int n) {
		int pwr = 1;
		if(n == 0) {
			//System.out.println(pwr);
			return pwr;
		}
		while(n>0) {
			pwr *= x;
			n--;
		}
		return pwr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rem=0;
		int res = 0;
		
		int power = 0;
		int temp = N;
		
		while(temp>0) {	
			power++;
			temp = temp/10;
		}
		temp = N;
		while(temp>0) {
		rem = temp % 10;
		temp = temp/10;
		//System.out.println(power);
		res += a.powerCheck(rem, power);
		}
		
		//System.out.println(res);
		
		if(N == res) {
			System.out.println(true);
		}
		else
			System.out.println(false);

	}
}
