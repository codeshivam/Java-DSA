package Pattern1;
import java.util.Scanner;
public class StarTriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i<=N) {
			int j = 1;
			while(j<=i) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
