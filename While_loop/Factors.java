package While_loop;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 2;
		while(i<=N/2) {
			if(N % i == 0)
				System.out.print(i+" ");
			i++;
		}
	}

}
