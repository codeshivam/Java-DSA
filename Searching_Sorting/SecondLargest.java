package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargest {
	
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
		int n = arr.length;
		if(n<=1) {
			return Integer.MIN_VALUE;
		}
		if(n ==2) {
			if(arr[0] > arr[1])
				return arr[1];
			else
				return arr[0];
		}
		int max = 0;
		int secondMax = Integer.MIN_VALUE;
		for(int i =0; i<n-1; i++) {
			if(arr[i+1] == arr[max])
				continue;
			if(arr[i+1] >  arr[max]) {
				secondMax = arr[max];
				max = i+1;
			}
			else
			if(arr[i+1] > secondMax)
				secondMax = arr[i+1];
		}
		return secondMax;
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
		int arr[] = takeInput();
		int num = secondLargestElement(arr);
		System.out.println(num);
		//printarr(merged);
		
	}

}
