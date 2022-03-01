package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedArrayMerging {
	
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
		int n1 = arr1.length;
		int n2 = arr2.length;
		if(n1==0 || n2 == 0) {
			if(n1 == 0)
				return arr2;
			else
				return arr1;
		}
		
		int arr[] = new int[n1+n2];
		int i = 0;
		int j = 0;
		int k = 0;
		while(k<n1+n2){
				if(i==n1 || j == n2) {
					if(i == n1) {
						while(k<n1+n2) {
							arr[k++] = arr2[j++];
						}
					}
					else
						while(k<n1+n2) {
							arr[k++] = arr1[i++];
						}
				}else {
					if(arr1[i] <= arr2[j]) {
						arr[k++] = arr1[i++];
					}
					else if(arr2[j] <= arr1[i]) {
						arr[k++] = arr2[j++];
					}
				}
				//System.out.println(k+"kkk");
		}
		//System.out.print(i+" "+j+" ");
		return arr;
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
		//int x = Integer.parseInt(br.readLine());
		int merged[] = merge(arr1,arr2);
		printarr(merged);
		
	}
}
