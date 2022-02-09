package While_loop;
import java.util.Scanner;
public class SumofEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rem,evenSum,oddSum;
		evenSum = 0;
		oddSum = 0;
		//temp = N;
		while(N>0) {
			if((rem = N%10) % 2 == 0)
				evenSum += rem;
			else
				oddSum += rem;
			N = N/10;
		}
		
		System.out.println(evenSum+" "+oddSum);
	}

}
