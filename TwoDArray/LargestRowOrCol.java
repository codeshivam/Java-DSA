package TwoDArray;

import java.util.Scanner;

public class LargestRowOrCol {
	
	public static void findLargest(int arr[][]){
		int row = arr.length;
		int rowNo = 0;
		int maxR = 0;
		if(row == 0) {
			System.out.println(Integer.MIN_VALUE);
			return;
		}
		int col = arr[0].length;
		
		int sum = 0;
		for(int i = 0; i< row; i++) {
			sum = 0;
			for(int j = 0; j<col; j++) {
				sum+=arr[i][j];
			}
			if(sum>maxR) {
				maxR = sum;
				rowNo = i;
			}
		}
		
		sum = 0;
		int colNo = 0;
		int maxC= 0;
		for(int i = 0; i< col; i++) {
			sum = 0;
			for(int j = 0; j<row; j++) {
				sum+=arr[j][i];
			}
			if(sum>maxC) {
				maxC = sum;
				colNo = i;
			}
		}
		
		if(maxC> maxR) {
			System.out.println("column"+" "+colNo+" "+maxC);
		}
		else
			System.out.println("row"+" "+rowNo+" "+maxR);
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		findLargest(arr);
		//printArray(arr);
		
	}

}
