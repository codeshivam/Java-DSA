package Recursion1;
/*
 * Given an array of length N, you need to find and return the sum of all elements of the array.
	Do this recursively.
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Output Format :
	Sum
	Constraints :
	1 <= N <= 10^3
	Sample Input 1 :
	3
	9 8 9
	Sample Output 1 :
	26
	Sample Input 2 :
	3
	4 2 1
	Sample Output 2 :
	7    
 */
import java.util.Scanner;

public class SumOfArray {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			input[i] = sc.nextInt();		
		}
		return input;
	}
	
	public static int sum(int arr[]) {
		
		if(arr.length == 1) {
			return arr[0];
		}
		//copy 1 to n in new array
		int newArr[] = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++) {
			newArr[i-1] = arr[i];
		}
		//call recursively
		return arr[0] + sum(newArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		//int x = sc.nextInt();
		System.out.println(sum(arr));
	}

}
