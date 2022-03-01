package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotate {
	
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        if(arr.length == d){
            return;
        }
        
        while(d>0){
            int temp = arr[0];
            int j = 1;
            while(j<arr.length){
                arr[j-1] = arr[j++];
            }
            arr[--j] = temp;
            d--;
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
		int x = Integer.parseInt(br.readLine());
		rotate(arr,x);
		printarr(arr);
		
	}

}
