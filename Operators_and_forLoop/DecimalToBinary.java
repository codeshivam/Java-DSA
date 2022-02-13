package Operators_and_forLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int rem;
		long placeValue =10;
		long ans = 0;
		int i = 0;
		while(dec>0) {
			rem = dec % 2;
			int j = 1;
			if(i==0) {
				placeValue = 1;
				//i++;
			}
			else if(i==1) {
				placeValue = placeValue*i;
				//i++;
			}
			else	
				while(j<=i-1) {
					placeValue = placeValue*10;
					j++;
				}
			//System.out.println(placeValue);
			ans = ans + rem * placeValue;
			placeValue=10;
			i++;
			dec = dec/2;
		}
		//System.out.println(count);
		
		System.out.println(ans);
		
	}

}
