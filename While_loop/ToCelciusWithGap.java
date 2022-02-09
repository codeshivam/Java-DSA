package While_loop;
import java.util.Scanner;
public class ToCelciusWithGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        
			int S,E,W;
	        S = sc.nextInt();
	        E = sc.nextInt();
	        W = sc.nextInt();
	        while(S<=E){
	            int res = (int) ((5.0/9)*(S-32));
	            System.out.println(S+"\t"+res);
	            S += W;
	}

	}
}
