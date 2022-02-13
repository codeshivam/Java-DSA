package Function;

import java.util.Scanner;

public class FarenhihtToCelcius {
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        int res = 0;
        int i = start;
		for(;start<=end;start=start+step){
            res = (int)((5.0/9) * (start-32));
            //System.out.println(res);
            System.out.println(start+" "+res);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		printFahrenheitTable(start, end, step);
	}

}
