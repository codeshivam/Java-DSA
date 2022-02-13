package Arrays;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
		int size = arr.length;
		int i = 0;
		while(i<size-1) {
			int j = 0;
			while(j<size) {
				if(i==j) {
					j++;
					continue;
				}
				if(arr[i] == arr[j]) {
					return arr[i];
				}
				j++;
			}
			i++;
		}
		return 0;
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
		//int x = sc.nextInt();
		System.out.println(duplicateNumber(arr));
	}

}
