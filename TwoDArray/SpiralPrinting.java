package TwoDArray;

import java.util.Scanner;

public class SpiralPrinting {
	
	public static void spiralPrint(int arr[][]){
		//Your code goes here
		int row = arr.length;
		int col = arr[0].length;
		if(row== 0) {
			return;
		}
		if(row==1) {
			for(int i = 0;i <col; i++) {
				System.out.print(arr[row-1][i]+" ");
			}
			return;
		}
		if(col==1) {
			for(int i = 0;i <row; i++) {
				System.out.print(arr[i][col-1]+" ");
			}
			return;
		}
		
		int elementNo = row * col;
		int startRow = 0;
		int endRow = row-1;
		int startCol = 0;
		int endCol = col-1;
		
		int i = 0;
		while(i<=elementNo) {
			for(int j = startCol; j<= endCol; j++) {
				System.out.print(arr[startRow][j]+" ");
			}
			//endCol--;
			startRow++;
			for(int j = startRow; j<=endRow; j++) {
				System.out.print(arr[j][endCol]+" ");
			}
			endCol--;
			for(int j = endCol; j>=startCol; j--) {
				System.out.print(arr[endRow][j]+" ");
			}
			endRow--;
			for(int j = endRow; j>=startRow; j--) {
				System.out.print(arr[j][startCol]+" ");
			}
			startCol++;
			i++;
		}
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
		spiralPrint(arr);
		//printArray(arr);
		
	}

}
