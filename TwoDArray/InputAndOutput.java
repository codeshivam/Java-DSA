package TwoDArray;

import java.util.Scanner;

public class InputAndOutput {
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		
		for(int i =0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				arr[i][j] = s.nextInt();	
			}
		}
		return arr;
	}
	
	public static void printArray(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		printArray(arr);
		
	}

}
