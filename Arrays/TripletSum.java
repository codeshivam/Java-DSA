package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TripletSum {
		
		public static int findTriplet(int arr[], int x) {
	    	//Your code goes here
			int triplet = 0;
			int i = 0;
			while(i< arr.length-2) {
				int j = i+1;
				while(j<arr.length -1) {
					int k = j + 1;
					while(k<arr.length) {
						if((arr[i] + arr[j] + arr[k]) == x) {
							triplet++;
						}
						k++;
					}
					j++;
				}
				i++;
			}
			return triplet;
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
		
//		public static void printarr(int arr[]) {
//			int size = arr.length;
//			for(int i = 0; i<size; i++) {
//				System.out.println(arr[i]);
//			}
//		}
		 
		public static void main(String[] args) throws NumberFormatException,IOException {
			// TODO Auto-generated method stub
			int arr[] = takeInput();
			int x = Integer.parseInt(br.readLine());
			//printarr(arr);
			System.out.println(findTriplet(arr,x));
		}


}
