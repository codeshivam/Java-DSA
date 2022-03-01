package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
    	//Your code goes here
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			int k = 0;
			for(int j = k+1; j<n-i; j++) {
				if(arr[k] > arr[j]) {
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
				k++;
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
		int arr[] = takeInput();
		//int x = Integer.parseInt(br.readLine());
		bubbleSort(arr);
		printarr(arr);
		
	}
}
