package Recursion1;

/*
 * Check Number in Array
	Send Feedback
	Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
	Do this recursively.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	Output Format :
	'true' or 'false'
	Constraints :
	1 <= N <= 10^3
	Sample Input 1 :
	3
	9 8 10
	8
	Sample Output 1 :
	true
	Sample Input 2 :
	3
	9 8 10
	2
	Sample Output 2 :
	false
 */

import java.util.Scanner;

public class CheckNumberBest {
	
	public static boolean checkNumber(int arr[], int x, int start) {
		
		if(start == arr.length)
			return false;
		if(arr[start] == x)
			return true;
		start++;
		return checkNumber(arr, x, start);
		
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
		System.out.println(checkNumber(arr,x,0));
	}
}
