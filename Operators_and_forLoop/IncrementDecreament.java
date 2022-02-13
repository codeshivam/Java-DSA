package Operators_and_forLoop;

public class IncrementDecreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		//int b = 43;
		//System.out.println(~60);
//		int y = a++;
//		int b = ++a;
//		System.out.println(y+" "+b);
		a += 5+(++a)+(a++);
		System.out.println(a);
	}

}
