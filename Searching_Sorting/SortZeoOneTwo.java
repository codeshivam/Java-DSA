package Searching_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortZeoOneTwo {
	
	public static void sort012(int[] arr){
    	//Your code goes here
       int n = arr.length;
        //j is for 2,1,0
        int i = 2;
        int j = n ;
		while(i>0){
			
            int k = 0;
            while(j>=k){
                if(arr[j] != i){
                    if(arr[k] == i){
                        int temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                        k++;
                        j--;
                    }
                    else
                    	k++;
                }
                else
                    j--;
            } 
            i--;
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
		sort012(arr);
		//System.out.println(num);
		printarr(arr);
		
	}

}
