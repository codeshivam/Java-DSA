package Recursion1;

/*
 * Last Index of Number
	Send Feedback
	Given an array of length N and an integer x, you need to find and return the last index of integer
	 x present in the array. Return -1 if it is not present in the array.
	Last index means - if x is present multiple times in the array, return the index at which x comes 
	last in the array.
	You should start traversing your array from 0, not from (N - 1).
	Do this recursively. Indexing in the array starts from 0.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	last index or -1
	Constraints :
	1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	3
 */

import java.util.Scanner;

public class LastIndexOfNumber {
	
	public static int lastIndex(int arr[], int x, int last) {
		if(last < 0) {
			return -1;
		}
		if(arr[last] == x)
			return last;
		
		return lastIndex(arr, x, last - 1);
	}
	
	public static int lastIndex(int arr[], int x) {
		int res = lastIndex(arr, x, arr.length - 1);
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
		System.out.println(lastIndex(arr,x));
	}

}
