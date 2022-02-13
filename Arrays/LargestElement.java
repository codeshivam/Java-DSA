package Arrays;

import java.util.Scanner;

public class LargestElement {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			input[i] = sc.nextInt();		
		}
		return input;
	}
	public static int findMax(int arr[]) {
		int size = arr.length;
		int max = arr[0];
		for(int i = 1; i<size; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int max = findMax(arr);
		System.out.println(max);
	}

}
