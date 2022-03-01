package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoArrays {
	
	public static int arrayInteger(int[] arr) {
		int res = 0;
		int i = 0;
		while(i<arr.length) {
			res = res * 10 + arr[i];
			i++;
		}
		return res;
		
	}
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
		int res1 = arrayInteger(arr1) + arrayInteger(arr2);
		//System.out.println(res1);
		int n= output.length;
		int i = n -1;
		while(i>=0) {
			if(res1<=0) {
				if(i == 0)
					output[i] = 0;
					break;
				}
			int digit = res1 %10;
			output[i--] = digit;
			res1 = res1/10;
			
	
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
