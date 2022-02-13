package Arrays;

import java.util.Scanner;

public class FindIntersaction {
	
	public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
		int i = 0;
		while(i<arr1.length) {
			int j = 0;
			while(j<arr2.length) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j] = -1;
					break;
				}
				j++;
			}
			i++;
		}
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
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		//int x = sc.nextInt();
		intersections(arr1,arr2);
	}


}
