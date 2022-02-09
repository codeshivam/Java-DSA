package While_loop;
import java.util.Scanner;
import java.lang.Math;
public class TotalSalaryCalculation {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int basicSal = sc.nextInt();
        String grade = sc.next();
        char c = grade.charAt(0);
        double totalSal, hra, da,pf;
        hra = (20.0 * basicSal)/100;
        da = (50.0 * basicSal)/100;
        pf = (11.0 * basicSal)/100;
//        System.out.println(hra);
//        System.out.println(da);
//        System.out.println(pf);
        totalSal = (basicSal + hra + da) - pf ;
        totalSal = Math.round(totalSal);
        int totalSalR = (int)totalSal;
        if(c == 'A') {
        	System.out.println(totalSalR + 1700);
        	return;
        }
        if(c == 'B') {
        	System.out.println(totalSalR + 1500);
        	return;
        }
        System.out.println(totalSalR + 1300);
	}
}
