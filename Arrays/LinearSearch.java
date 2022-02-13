package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i = 0; i<size; i++) {
			input[i] = sc.nextInt();		
		}
		return input;
	}
	public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int size = arr.length;
        for(int i = 0; i<size ; i++){
            if(arr[i] == x)
                return i;
        }
       return -1; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int x = sc.nextInt();
		System.out.println(linearSearch(arr, x));
	}

}
