package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckArrayRotation {
	
	public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
		int n = arr.length;
		if(n<=1) {
			return 0;
		}
		int max =0;
		int i = 0;
		while(i<n-1) {
			if(arr[i+1] > arr[max]) {
				max = i+1;
			}
			if((i==n-2) && (max == n-1))
				return 0;
			i++;
		}
		return max + 1;
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
		//int x = Integer.parseInt(br.readLine());
		int n=arrayRotateCheck(arr);
		//printarr(arr);
		System.out.println(n);
		
	}

}
