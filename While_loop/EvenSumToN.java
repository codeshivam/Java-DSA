package While_loop;
import java.util.Scanner;
public class EvenSumToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	            int N = sc.nextInt();
	            int i = 2;
	        	int evenSum = 0;
	        	while(i<=N){
	              evenSum += i;
	                i += 2;
	            }
			System.out.println(evenSum);
		}

}
