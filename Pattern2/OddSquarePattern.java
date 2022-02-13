package Pattern2;
import java.util.Scanner;
public class OddSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int last;
		int odd = 1;
		int i = 1;
		while(i<=N) {
			int j = N;
			
			while(j>=1) {
				if(i==1) {
					System.out.println(2*j-1);
				}
				j--;
			}
			
			System.out.println();
			odd+=2;
			i++;
		}
	}

}
