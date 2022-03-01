package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
    	//Your code goes here
		
		int temp;
		for(int i = 0; i<arr.length-1; i++) {
			// take min = index of i default
			int min = i;
			//int pos = 0;;
			for(int j = i + 1;j<arr.length;j++) {
				//if index jth is lower than min index, assign min = j
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//swap arr[i] to arr[min]
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
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
		selectionSort(arr);
		printarr(arr);
		
	}
}
