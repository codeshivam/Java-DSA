package TwoDArray;

import java.util.Scanner;

public class TotalSumOnBoundries {
	
	
	public static void rowWiseSum(int arr[][]) {
		int row = arr.length;
		if(row == 0) {
			return;
		}
		int col = arr[0].length;
		
		int sum = 0;
		for(int i = 0; i< row; i++) {
			//sum = 0;
			for(int j = 0; j<col; j++) {
				sum+=arr[i][j];
			}			
		}
		System.out.println(sum);
	}
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = row;
		int arr[][] = new int[row][col];
		
		for(int i =0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				arr[i][j] = s.nextInt();	
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		rowWiseSum(arr);
		//printArray(arr);
		
	}

}
