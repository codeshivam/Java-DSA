package Operators_and_forLoop;

import java.util.Scanner;

public class ValidSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		if(N<=1) {
			System.out.println(false);
			return;
		}
		//int current = 0;
		int prev = 0;
		boolean res = true;
		boolean isDec = true;
		//int val = sc.nextInt(); 
		while(i<=N) {
			int val = sc.nextInt();
			if(i == 1) {
				prev = val;
				i++;
				continue;
			}
			if(prev == val) {
				//System.out.println(false);
				res = false;
			}
			if(val > prev) {
				if(isDec)
					isDec = false;
				prev = val;
			}
			else if(val < prev) {
				if(!isDec) {
					//System.out.println(false);
					res = false;
					break;
				}
			}
			
			i++;
		}
		//if(i>N)
			System.out.println(res);
	}

}
