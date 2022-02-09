package if_else;
import java.util.Scanner;
public class FindCharacterCase {
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        char c = str.charAt(0);
	        int cInt = (int)c;
	        if(cInt <= 90 && cInt>=65){
	            System.out.println(1);
	            return ;
	        }
	        if(cInt <= 122 && cInt>=97){
	            System.out.println(0);
	            return;
	        }
	        else{
	            System.out.println(-1);
	        }
		
	    }
}
