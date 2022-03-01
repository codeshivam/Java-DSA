package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoArrayBestApproach {
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = n1 -1;
		int j = n2 - 1;
		int k = output.length -1;
		int num = 0;
		int carry = 0;
		int rem = 0;
		
		while(k>=0) {
			if((i<0 || j<0) && n1!=n2)
				break;
			rem = 0;
			if(k!=0) {
				num = arr1[i--] + arr2[j--] + carry;
			}
			else
				num = rem + carry;
			rem = num % 10;
			carry = num/10;
			output[k] = rem;
			k--;
		}
		
		if(i>=0) {
			while(k>=0) {
				rem = 0;
				if(k!=0) {
					num = arr1[i--] + carry;
				}
				else
					num = rem + carry;
				rem = num % 10;
				carry = num/10;
				output[k] = rem;
				k--;
			}
		}
		if(j>=0) {
			
			while(k>=0) {
				rem =0;
				if(i>=0) {
					num = arr1[i--] + carry;
				}
				rem = num % 10;
				carry = num/10;
				output[k] = rem;
				k--;
			}
		}
		
    }
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput()throws IOException{
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		String[] strNum = br.readLine().split("\\s");
		for(int i = 0; i<size; i++) {
			arr[i] = Integer.parseInt(strNum[i]);
		}
		return arr;
	}
	public static void printarr(int arr[]) {
		int size = arr.length;
		for(int i = 0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}
	 
	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		int arr3[] = new int[arr1.length +1];
		sumOfTwoArrays(arr1, arr2, arr3);
		//System.out.println(num);
		printarr(arr3);
		
	}


}



	
