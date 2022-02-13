package Function;

import java.util.Scanner;

public class CnR {
	public static int fact(int n) {
		int i = 1;
		int res = 1;
		while(i<=n) {
			if(n<=0)
				return 0;
			res*=i;
			i++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int factn = fact(n);
		int factr = fact(r);
		int factnr = fact(n-r);
		int res = factn/(factr*factnr);
		System.out.println(res);
	}

}
