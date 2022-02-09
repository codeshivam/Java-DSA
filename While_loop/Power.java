package While_loop;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int pwr = 1;
		if(n == 0) {
			System.out.println(pwr);
			return;
		}
		while(n>0) {
			pwr *= x;
			n--;
		}
		System.out.println(pwr);
	}
}
