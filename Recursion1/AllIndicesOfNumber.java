package Recursion1;

/*
 * All Indices of Number
	Send Feedback
	Given an array of length N and an integer x, you need to find all the indexes where x is present
	 in the input array. Save all the indexes in an array (in increasing order).
	Do this recursively. Indexing in the array starts from 0.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	indexes where x is present in the array (separated by space)
	Constraints :
	1 <= N <= 10^3
	Sample Input :
	5
	9 8 10 8 8
	8
	Sample Output :
	1 3 4
 */

import java.util.Scanner;

public class AllIndicesOfNumber {
	

	public static int[] allIndexes(int arr[], int x, int start) {
		if(start == arr.length) {
			return new int[0];
		}
//		if(arr[start] == x)
//			arr1[i++] = start;
		
		int smallAns[] = allIndexes(arr, x, start + 1);
		if(arr[start]==x) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=start;
			for(int i=0;i<smallAns.length;i++)
				ans[i+1]=smallAns[i];
			return ans;
		}
		return smallAns;
	}
	
	public static int[] allIndexes(int arr[], int x) {
		int res[] = allIndexes(arr, x, 0);
		return res;
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			input[i] = sc.nextInt();		
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int x = sc.nextInt();
		int arr1[] = allIndexes(arr,x);
		for(int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
