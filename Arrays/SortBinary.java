package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortBinary {

	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        
        int size = arr.length;
        int temp = 0;
        if(size == 1){
            //System.out.println(arr[1]);
            return;
        }

        int j = size - 1;
        for(int i = 0; i<j; i++){
            
            if(arr[i] !=0){
                //j scan from last if find 0 it swap with ith element which is 1
                while(j>i){
	                if(arr[j] == 0){
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                    j--;
	                    break;
	                }
	                else
	                    j--;
                }
            
            }
    	 //i++;
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
		sortZeroesAndOne(arr);
		printarr(arr);
		
	}
}
