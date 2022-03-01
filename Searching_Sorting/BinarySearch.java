package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = (start + end)/2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				end = mid -1;
			else
				start = mid + 1;
		}
		return -1;
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
	 
	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int x = Integer.parseInt(br.readLine());
		int pos = binarySearch(arr,x);
		System.out.println(pos);
		
	}

}
