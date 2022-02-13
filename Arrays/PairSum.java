package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairSum {
	
	public static int pairSum(int arr[], int x) {
    	//Your code goes here
		int pair = 0;
		int i = 0;
		while(i< arr.length-1) {
			int j = i+1;
			while(j<arr.length) {
				if((arr[i] + arr[j]) == x) {
					pair++;
				}
				j++;
			}
			i++;
		}
		return pair;
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
	
//	public static void printarr(int arr[]) {
//		int size = arr.length;
//		for(int i = 0; i<size; i++) {
//			System.out.println(arr[i]);
//		}
//	}
	 
	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int x = Integer.parseInt(br.readLine());
		//printarr(arr);
		System.out.println(pairSum(arr,x));
	}

}
