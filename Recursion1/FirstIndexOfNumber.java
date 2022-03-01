package Recursion1;

/*
 * First Index of Number
	Send Feedback
	Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
	First index means, the index of first occurrence of x in the input array.
	Do this recursively. Indexing in the array starts from 0.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	first index or -1
	Constraints :
	1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	1
 */

import java.util.Scanner;

public class FirstIndexOfNumber {
	
	public static int firstIndex(int arr[], int x, int start) {
		if(start == arr.length) {
			return -1;
		}
		if(arr[start] == x)
			return start;
		
		return firstIndex(arr, x, start + 1);
	}
	
	public static int firstIndex(int arr[], int x) {
		int res = firstIndex(arr, x, 0);
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
		System.out.println(firstIndex(arr,x));
	}

}
