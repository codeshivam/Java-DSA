package Pattern2;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n1 = (N/2) + 1;
		//System.out.println(n1);
		int remember = 0;
		int n2 = (N/2);
		//System.out.println(n2);
		int i = 1;
		while(i<=n1) {
			int space = 1;
			while(space <= n1-i) {
				System.out.print(" ");
				space++;
			}
			int star = 1;
			while(star<= 2*i - 1) {
				System.out.print('*');
				star++;
				if(star == 2*i-1)
					remember = 2*i-1;
			}
			System.out.println();
			i++;
		}
		//System.out.println(remember);
		remember -= 2;
		i = 1;
		while(i<=n2) {
			int space = 1;
			while(space<=i) {
				System.out.print(' ');
				space++;
			}
			int c = remember;
			while(c>=1) {
				System.out.print('*');
				c--;
			}
			remember -= 2;
			System.out.println();
			i++;
		}
		

	}

}
