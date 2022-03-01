package TwoDArray;

import java.util.Scanner;

public class PrintLikeWave {
	
	public static void printWave(int arr[][]) {
		int row = arr.length;
		if(row == 0) {
			return;
		}
		
		int col = arr[0].length;
		int i = 0;
		while(i<col) {
			if(i % 2 == 0) {
				for(int j = 0;j<row; j++) {
					System.out.print(arr[j][i]+" ");
				}
			}
			else {
				for(int j = row-1;j>=0; j--) {
					System.out.print(arr[j][i]+" ");
				}
			}
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
		printWave(arr);
		//printArray(arr);
		
	}

}
