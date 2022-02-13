package Arrays;

import java.util.Scanner;

public class ReturnArraySum {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			input[i] = sc.nextInt();		
		}
		return input;
	}
	public static int arraySum(int arr[]) {
		int size = arr.length;
		int res = 0;
		for(int i = 0; i<size; i++) {
			res+=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int res = 0;
		for(int i = 0; i<testCase; i++) {
			int arr[] = takeInput();
			res = arraySum(arr);
			System.out.println(res);
		}
	}

}
