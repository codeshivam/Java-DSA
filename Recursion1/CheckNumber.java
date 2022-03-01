package Recursion1;
/*
 
 */
import java.util.Scanner;

public class CheckNumber {
	
	public static boolean checkNumber(int arr[], int x) {
		
		if(arr[0] == x)
			return true;
		else if(arr.length == 1)
			return false;
		if(arr[arr.length - 1]== x)
			return true;
		//copy 1 to n in new array
		int newArr[] = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++) {
			newArr[i-1] = arr[i];
		}
		//call recursively
		boolean res = checkNumber(newArr, x);
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
		System.out.println(checkNumber(arr,x));
	}

}
