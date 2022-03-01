package Searching_Sorting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PushZeroToEndBestApproach {
		
		public static void pushZerosAtEnd(int[] arr) {
	    	//Your code goes here
			int n = arr.length;
			int current = 0;
			int nonZero = 0;
			while(current<n) {
				if(arr[current] != 0) {
					int temp = arr[current];
					arr[current] = arr[nonZero];
					arr[nonZero++] = temp;
				}
				current +=1;
			}
		}
		
		
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		public static int[] takeInput()throws IOException{
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[size];
			String[] strNum = br.readLine().split("\\s");
			for(int i = 0; i<size; i++) {
				arr[i] = Integer.parseInt(strNum[i]);
			}
			return arr;
		}
		
		public static void printarr(int arr[]) {
			int size = arr.length;
			for(int i = 0; i<size; i++) {
				System.out.println(arr[i]);
			}
		}
		 
		public static void main(String[] args) throws NumberFormatException,IOException {
			// TODO Auto-generated method stub
			int arr[] = takeInput();
			//int x = Integer.parseInt(br.readLine());
			pushZerosAtEnd(arr);
			printarr(arr);
			//System.out.println(n);
			
		}

}
