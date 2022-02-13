package Operators_and_forLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int rem=0;
		int base = 2;
		int dec = 0;
		int power = 0;
		
		while(bin>0) {
		rem = bin % 10;
		// if rem = 0, it means it will be 0 in binary  to decimal
		
		if(rem != 0) {
			int i = 1;
			if(power != 0) {
				while(i<=power) {
					if(i==1)
						base = base * i;
					else
						base = base * 2;
					//System.out.println(res);
					i++;
				}
				dec += base;
				base = 2;
			}else
				dec = 1;
		}
		power++;
		bin = bin/10;
		//System.out.println(bin);
		}
		System.out.println(dec);
		//System.out.println(power);
	}

}
